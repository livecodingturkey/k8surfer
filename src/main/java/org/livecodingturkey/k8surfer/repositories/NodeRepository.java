package org.livecodingturkey.k8surfer.repositories;

import org.livecodingturkey.k8surfer.models.Node;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface NodeRepository extends MongoRepository<Node,String> {

    @Query("{id: '?0'}")
    Node getNodeDetailsByNodeId(String nodeId);
}
