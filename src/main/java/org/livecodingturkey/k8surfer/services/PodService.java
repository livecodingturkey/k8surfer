package org.livecodingturkey.k8surfer.services;

import org.livecodingturkey.k8surfer.models.Pod;
import org.livecodingturkey.k8surfer.repositories.PodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodService {

    @Autowired
    private PodRepository podRepository;

    public List<Pod> getAllPods(){
        return podRepository.findAll();
    }

    public boolean addPod(Pod pod){
        podRepository.save(pod);
        return true;
    }
}
