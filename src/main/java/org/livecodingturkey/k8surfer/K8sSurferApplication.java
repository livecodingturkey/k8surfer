package org.livecodingturkey.k8surfer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
public class K8sSurferApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sSurferApplication.class, args);
	}

}
