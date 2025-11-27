package com.senai.infob.prova.configs;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Nome da Concessionaria",
        version = "1.0",
        description = "E-mail para contato: g@outlooik"
    )
)
public class Swagger {

}