package com.cloudaware.cloudmine.amazon;

import com.amazonaws.AmazonWebServiceRequest;

public interface AmazonCall<T, RqT extends AmazonWebServiceRequest, RsT extends AmazonResponse> {
    void call(T client, RqT request, RsT response) throws Exception;
}
