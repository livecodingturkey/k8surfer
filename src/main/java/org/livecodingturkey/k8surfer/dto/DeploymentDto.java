package org.livecodingturkey.k8surfer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeploymentDto {

    private String name;
    private String status;
    private String restarts;
    private String age;
}
