package org.livecodingturkey.k8surfer.models.node;

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


    private static class SystemInfo{

        private String operatingSystem;
        private String operatingSystemImage;

    }

}
