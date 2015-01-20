package com.microsoft.bingads.internal.bulk.file;

import java.util.Iterator;

import com.microsoft.bingads.bulk.BulkFileReader;
import com.microsoft.bingads.bulk.entities.BulkEntity;

public class ExtractChildEntitiesIterator implements Iterator<BulkEntity> {

    private Iterator<? extends BulkEntity> children;
    private Iterator<BulkEntity> currentChildIterator;

    public ExtractChildEntitiesIterator(Iterator<? extends BulkEntity> children) {
        this.children = children;
    }

    @Override
    public boolean hasNext() {
        this.update();

        if (this.currentChildIterator == null) {
            return false;
        }

        return this.currentChildIterator.hasNext();
    }

    @Override
    public BulkEntity next() {
        this.update();

        if (this.currentChildIterator.hasNext()) {
            return this.currentChildIterator.next();
        }

        throw new UnsupportedOperationException();
    }

    public void update() {
        if (currentChildIterator == null || !currentChildIterator.hasNext()) {
            if (children.hasNext()) {
                BulkEntity nextChild = children.next();
                currentChildIterator = BulkFileReader.extractChildEntitiesIfNeeded(nextChild);
            } else {
                currentChildIterator = null;
            }
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
