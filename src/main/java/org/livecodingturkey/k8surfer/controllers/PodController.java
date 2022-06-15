package org.livecodingturkey.k8surfer.controllers;

import org.livecodingturkey.k8surfer.models.Pod;
import org.livecodingturkey.k8surfer.services.PodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pod")
public class PodController {

    @Autowired
    private PodService podService;

    @GetMapping
    public List<Pod> getAllPods(){
        return podService.getAllPods();
    }

    @PostMapping
    public boolean addPod(@RequestBody Pod pod){
        return podService.addPod(pod);
    }
}
