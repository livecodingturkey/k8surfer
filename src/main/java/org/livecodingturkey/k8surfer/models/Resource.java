package org.livecodingturkey.k8surfer.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("resources")
public class Resource {

    @Id
    private String id;

    private String name;

    private String apiVersion;

    private String kind;
}
