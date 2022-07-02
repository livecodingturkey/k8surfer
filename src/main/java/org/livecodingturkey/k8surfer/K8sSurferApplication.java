package org.livecodingturkey.k8surfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableWebMvc
public class K8sSurferApplication {
	public static void main(String[] args) {
		SpringApplication.run(K8sSurferApplication.class, args);
	}

}
