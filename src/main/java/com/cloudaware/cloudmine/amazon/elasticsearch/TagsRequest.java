package com.cloudaware.cloudmine.amazon.elasticsearch;

import com.amazonaws.services.elasticsearch.model.Tag;

import java.util.List;

/**
 * User: tolstikov
 * Date: 2/18/16
 */
public final class TagsRequest {

    private List<Tag> tags;

    public TagsRequest(final List<Tag> tags) {
        this.tags = tags;
    }

    public TagsRequest() {
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(final List<Tag> tags) {
        this.tags = tags;
    }
}
