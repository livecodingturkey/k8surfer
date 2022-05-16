package org.livecodingturkey.k8surfer.services;

import lombok.RequiredArgsConstructor;
import org.livecodingturkey.k8surfer.controllers.requests.CreateResourceRequest;
import org.livecodingturkey.k8surfer.models.Resource;
import org.livecodingturkey.k8surfer.repositories.ResourceRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResourceService {

    private final ResourceRepository resourceRepository;
    public void create(CreateResourceRequest request) {
        Resource resource = Resource.builder()
                .name(request.getName())
                .apiVersion(request.getApiVersion())
                .kind(request.getKind().getValue())
                .build();
        resourceRepository.save(resource);
    }
}
