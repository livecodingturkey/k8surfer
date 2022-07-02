package org.livecodingturkey.k8surfer.controllers;

import lombok.RequiredArgsConstructor;
import org.livecodingturkey.k8surfer.models.Node;
import org.livecodingturkey.k8surfer.services.NodeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nodes")
@RequiredArgsConstructor
public class NodeController {
    private final NodeService nodeService;

    @GetMapping("/{id}")
    public Node getNodeById(@PathVariable("id") String id){
        return nodeService.getDetailsById(id);
    }

    @PostMapping
    public Node add(@RequestBody Node node){
        return nodeService.add(node);
    }

    @GetMapping()
    public List<Node> getAll(){
        return nodeService.getAll();
    }
}
