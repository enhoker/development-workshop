package ru.sbt.myhomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class DockerComposeClientApplication {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public ResponseEntity<String> callClient() {
        return new ResponseEntity<>("Client: reception", HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/callServerFromClient")
    public ResponseEntity<String> callServerFromClient() {
        RestTemplate restTemplate = new RestTemplate();
        String message = restTemplate.getForObject("http://spring-boot-server:9002/callServer", String.class);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerComposeClientApplication.class, args);
    }

}