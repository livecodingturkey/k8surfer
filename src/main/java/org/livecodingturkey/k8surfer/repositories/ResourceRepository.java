package org.livecodingturkey.k8surfer.repositories;

import org.livecodingturkey.k8surfer.models.Resource;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResourceRepository extends MongoRepository<Resource, String> {
}
