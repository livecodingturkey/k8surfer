package org.livecodingturkey.k8surfer.controllers.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.livecodingturkey.k8surfer.models.Kind;

import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateResourceRequest {

    @NotEmpty
    private String id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String apiVersion;

    private Kind kind;

    private Set<ResourceProperty> properties;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    private static class ResourceProperty {
        private String key;
        private String value;
    }
}
