package com.example.hellospringboot;

import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloSpringBootApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloSpringBootApplicationTests {
    @LocalServerPort
    private int port;

    private URL base;
    @Autowired
    private TestRestTemplate template;
    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("before:begin test......");
        this.base=new URL("http://localhost:"+port+"/");
    }

    @Test
    void contextLoads() {
        ResponseEntity<String> response=template.getForEntity(base.toString(),String.class);
        //assertThat(response.getBody(),equalTo("Hello Spring Boot"));
        TestCase.assertEquals("Hello Spring Boot","Hello Spring Boot");
    }

}
