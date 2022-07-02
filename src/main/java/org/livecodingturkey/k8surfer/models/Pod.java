package org.livecodingturkey.k8surfer.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Document("pods")
public class Pod {

    @Id
    private String id;

    private String apiVersion;
    private Status status;
    private String ip;
    private MetaData metadata;
    private Specification spec;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Specification{

        private List<Container> containers;

        @AllArgsConstructor
        @Data
        @NoArgsConstructor
        public static class Container{
            private String name;
            private String image;
        }
    }



    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class MetaData{
        private String generateName;
        private String creationTimestamp;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class Status{

        private String phase;
        private String startTime;
        private List<ContainerStatus> containerStatuses;

        @NoArgsConstructor
        @AllArgsConstructor
        @Data
        public static class ContainerStatus{
            private String name;
            private State state;

            @Data
            @NoArgsConstructor
            @AllArgsConstructor
            public static class State{

                private Running running;
                @Data
                @NoArgsConstructor
                @AllArgsConstructor
                public static class Running{
                    private String startedAt;
                }
            }
        }
    }

}

