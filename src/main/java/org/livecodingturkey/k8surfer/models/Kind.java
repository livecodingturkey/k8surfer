package org.livecodingturkey.k8surfer.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Kind {
    Node("Node"),
    Deployment("Deployment"),
    Pod("Pod"),
    Replicaset("Replicaset"),
    Secret("Secret"),
    ConfigMap("ConfigMap");

    private String value;
}
