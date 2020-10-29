package com.example.springdemo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoControllerTest {

    @Autowired
    private TestRestTemplate template;

    @LocalServerPort
    private int port;

    @Test
    void testShowDemo() throws URISyntaxException {
        ResponseEntity<String> response = template.getForEntity(new URI("http://localhost:" + port + "/").toString(), String.class);
        assertEquals("success", response.getBody());
    }
}
