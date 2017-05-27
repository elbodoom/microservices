package br.com.followthetruck.support.configmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by elbodoom on 26/05/17.
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer
public class ConfigManagementService {
    public static void main(String[] args) {
        SpringApplication.run(ConfigManagementService.class, args);
    }
}
