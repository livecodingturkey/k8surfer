package org.livecodingturkey.k8surfer.services;

import lombok.RequiredArgsConstructor;
import org.livecodingturkey.k8surfer.models.Node;
import org.livecodingturkey.k8surfer.repositories.NodeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NodeService {
    private final NodeRepository nodeRepository;

    public Node add(Node node){
        return nodeRepository.save(node);
    }

    public Node getDetailsById(String id){
        return nodeRepository.findById(id).get();
    }

    public List<Node> getAll(){
        return nodeRepository.findAll();
    }
}
