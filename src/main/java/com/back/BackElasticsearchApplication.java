package com.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.config.EnableElasticsearchAuditing;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
@EnableElasticsearchAuditing
public class BackElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackElasticsearchApplication.class, args);
    }

}
