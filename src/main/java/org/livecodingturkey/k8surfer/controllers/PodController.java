package org.livecodingturkey.k8surfer.controllers;

import lombok.RequiredArgsConstructor;
import org.livecodingturkey.k8surfer.models.Pod;
import org.livecodingturkey.k8surfer.services.PodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pods")
@RequiredArgsConstructor
public class PodController {
    private final PodService podService;

    @GetMapping
    public List<Pod> getAll(){
        return podService.getAll();
    }

    @PostMapping
    public boolean add(@RequestBody Pod pod){
        return podService.add(pod);
    }
}
