package org.livecodingturkey.k8surfer.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.livecodingturkey.k8surfer.controllers.requests.CreateResourceRequest;
import org.livecodingturkey.k8surfer.services.ResourceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/resources")
@Slf4j
@RequiredArgsConstructor
public class ResourceController {

    private final ResourceService resourceService;

    @GetMapping
    public String hello() {
        return "Hello world";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody CreateResourceRequest request) {
        resourceService.create(request);
    }

}
