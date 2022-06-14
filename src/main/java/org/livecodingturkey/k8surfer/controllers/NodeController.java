package org.livecodingturkey.k8surfer.controllers;

import org.livecodingturkey.k8surfer.models.Node;
import org.livecodingturkey.k8surfer.services.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/node")
public class NodeController {

    @Autowired
    private NodeService nodeService;

    @GetMapping("/")
    public Node getNodeDetailsByNodeId(@RequestParam String nodeId){
        return nodeService.getNodeDetailsByNodeId(nodeId);
    }

    @PostMapping
    public Node addNode(@RequestBody Node node){
        return nodeService.addPod(node);
    }

    @GetMapping("/getall")
    public List<Node> getAllNodes(){
        return nodeService.getAllNodes();
    }
}
