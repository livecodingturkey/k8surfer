package org.livecodingturkey.k8surfer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("pods")
public class Pod {

    @Id
    private String id;

    private String name;
    private String apiVersion;
    private List<PodContainer> containersOfThePod;

    @AllArgsConstructor
    @Data
    @NoArgsConstructor
    private static class PodContainer{
        private String containerName;
        private String containerImage;
    }

}
