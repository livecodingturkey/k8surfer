package org.livecodingturkey.k8surfer.services;

import lombok.RequiredArgsConstructor;
import org.livecodingturkey.k8surfer.models.Pod;
import org.livecodingturkey.k8surfer.repositories.PodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PodService {
    private final PodRepository podRepository;

    public List<Pod> getAll(){
        return podRepository.findAll();
    }

    public boolean add(Pod pod){
        podRepository.save(pod);
        return true;
    }
}
