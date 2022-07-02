package org.livecodingturkey.k8surfer.repositories;

import org.livecodingturkey.k8surfer.models.Node;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NodeRepository extends MongoRepository<Node,String> {

}
