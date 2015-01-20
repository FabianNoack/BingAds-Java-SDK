package com.microsoft.bingads.internal.bulk.entities.negativesites;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.microsoft.bingads.internal.functionalInterfaces.Predicate;

import com.microsoft.bingads.bulk.entities.Status;
import com.microsoft.bingads.bulk.entities.BulkAdGroupNegativeSites;
import com.microsoft.bingads.bulk.entities.BulkEntity;
import com.microsoft.bingads.internal.bulk.entities.MultiRecordBulkEntity;
import com.microsoft.bingads.internal.bulk.file.BulkObjectWriter;
import com.microsoft.bingads.internal.bulk.file.BulkStreamReader;
import com.microsoft.bingads.internal.bulk.file.TryResult;

/**
 * This abstract base class for the bulk negative sites that assigned in sets to
 * a campaign or ad group entity.
 *
 * @see BulkAdGroupNegativeSites
 * @see BulkCampaignNegativeSites
 */
public abstract class BulkNegativeSites<TNegativeSite extends BulkNegativeSite<TIdentifier>, TIdentifier extends BulkNegativeSiteIdentifier> extends MultiRecordBulkEntity {

    private List<TNegativeSite> bulkNegativeSites = new ArrayList<TNegativeSite>();

    private TIdentifier firstRowIdentifier;

    private boolean hasDeleteAllRow;

    /**
     * The status of the negative site association. The value is Active if the
     * negative site is assigned to the parent entity. The value is Deleted if
     * the negative site is removed from the parent entity, or should be removed
     * in a subsequent upload operation. Corresponds to the 'Status' field in
     * the bulk file.
     */
    private Status status;// { get; set; }

    private Class<TNegativeSite> negativeSiteClass;

    private Class<TIdentifier> identifierClass;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Reserved for internal use.
     */
    public List<TNegativeSite> getNegativeSites() {
        return Collections.unmodifiableList(this.bulkNegativeSites);
    }

    @Override
    public List<? extends BulkEntity> getChildEntities() {
        return Collections.unmodifiableList(this.bulkNegativeSites);
    }

    /**
     * Reserved for internal use.
     */
    protected BulkNegativeSites() {

    }

    protected BulkNegativeSites(TNegativeSite site, Class<TNegativeSite> negativeSiteClass, Class<TIdentifier> identifierClass) {
        this(site.getIdentifier(), negativeSiteClass, identifierClass);
        bulkNegativeSites.add(site);
    }

    protected BulkNegativeSites(TIdentifier identifier, Class<TNegativeSite> negativeSiteClass, Class<TIdentifier> identifierClass) {
        this.negativeSiteClass = negativeSiteClass;
        this.identifierClass = identifierClass;
        this.firstRowIdentifier = identifier;

        this.hasDeleteAllRow = identifier.isDeleteRow();       
    }

    /**
     * Reserved for internal use.
     */
    protected abstract TIdentifier createIdentifier();

    protected abstract void validatePropertiesNotNull();

    @Override
    public void writeToStream(BulkObjectWriter streamWriter) throws IOException {
        validatePropertiesNotNull();

        TIdentifier deleteRow = createIdentifier();

        deleteRow.setStatus(Status.DELETED);
        streamWriter.writeObjectRow(deleteRow);

        if (status == Status.DELETED) {
            return;
        }

        for (TNegativeSite site : convertApiToBulkNegativeSites()) {
            site.writeToStream(streamWriter);
        }
    }

    /**
     * Reserved for internal use.
     */
    protected abstract Iterable<TNegativeSite> convertApiToBulkNegativeSites();

    /**
     * Reserved for internal use.
     */
    protected abstract void reconstructApiObjects();

    @Override
    public void readRelatedDataFromStream(BulkStreamReader reader) {
        boolean hasMoreRows = true;

        while (hasMoreRows) {

            TryResult<TNegativeSite> nextSiteResult = reader.tryRead(new Predicate<TNegativeSite>() {
                @Override
                public boolean test(TNegativeSite x) {
                    return x.getIdentifier().equals(firstRowIdentifier);
                }
            }, this.negativeSiteClass);

            if (nextSiteResult.isSuccessful()) {
                this.bulkNegativeSites.add(nextSiteResult.getResult());
                continue;
            }

            TryResult<TIdentifier> identifierResult = reader.tryRead(new Predicate<TIdentifier>() {
                @Override
                public boolean test(TIdentifier x) {
                    return x.equals(firstRowIdentifier);
                }
            }, this.identifierClass);

            if (identifierResult.isSuccessful()) {
                if (identifierResult.getResult().isDeleteRow()) {
                    this.hasDeleteAllRow = true;
                }
            } else {
                hasMoreRows = false;
            }
        }

        reconstructApiObjects();

        this.status = bulkNegativeSites != null && bulkNegativeSites.size() > 0
                ? Status.ACTIVE
                : Status.DELETED;
    }

    @Override
    public boolean allChildrenPresent() {
        return this.hasDeleteAllRow;
    }
}
