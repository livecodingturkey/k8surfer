package org.livecodingturkey.k8surfer.repositories;

import org.livecodingturkey.k8surfer.models.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Integer> {
}
