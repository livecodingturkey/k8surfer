package org.livecodingturkey.k8surfer.repositories;

import org.livecodingturkey.k8surfer.models.Pod;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PodRepository extends MongoRepository<Pod,String> {

}
