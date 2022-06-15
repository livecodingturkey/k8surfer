package org.livecodingturkey.k8surfer.services;

import lombok.RequiredArgsConstructor;
import org.livecodingturkey.k8surfer.models.Node;
import org.livecodingturkey.k8surfer.repositories.NodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NodeService {

    @Autowired
    private NodeRepository nodeRepository;

    public Node addPod(Node node){
        return nodeRepository.save(node);
    }

    public Node getNodeDetailsByNodeId(String nodeId){
        return nodeRepository.getNodeDetailsByNodeId(nodeId);
    }

    public List<Node> getAllNodes(){
        return nodeRepository.findAll();
    }
}
