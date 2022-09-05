package com.example.eventregistrypoc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.info.BuildProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Autowired
    BuildProperties buildProperties;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info()
                        .title(buildProperties.getName())
                        .description("POC Protools avec Flowable BPMN Engine")
                        .version(buildProperties.getVersion()));
    }


}
