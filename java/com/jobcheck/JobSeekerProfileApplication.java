package com.jobcheck;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;

@SpringBootApplication
public class JobSeekerProfileApplication {
	
	//@Value(value = "${swagger.url.productionURL}")
	//public String productionURL;

   @Value(value = "${swagger.url.localURL}")
   public String localURL;

	public static void main(String[] args) {
		SpringApplication.run(JobSeekerProfileApplication.class, args);
	}

	@Bean
    public OpenAPI customOpenAPI() {
       // Server productionserver = new Server();
        Server localserver = new Server();
        List<Server> servers = new ArrayList<>();
       // productionserver.setUrl(productionURL);
         localserver.setUrl(localURL);
       // servers.add(productionserver);
        servers.add(localserver);
        OpenAPI openAPI = new OpenAPI();
        openAPI.setServers(servers);
        return openAPI;
    }
}
