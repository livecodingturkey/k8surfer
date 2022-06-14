package org.livecodingturkey.k8surfer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("nodes")
public class Node {

    @Id
    private String id;

    private String name;
    private String status;
    private Capacity capacity;
    private SystemInfo systemInfo;
    private String roles;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Capacity{

        private String cpu;
        private String memory;
        private int pods;

    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class SystemInfo{
        private String osImage;
        private String operatingSystem;
    }


}
