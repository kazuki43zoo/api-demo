package com.example.apidemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloRestController {
  private static final Logger logger = LoggerFactory.getLogger(HelloRestController.class);

  private final HelloRepository repository;

  HelloRestController(HelloRepository repository) {
    this.repository = repository;
  }

  @GetMapping
  public String hello() throws UnknownHostException {
    String hostname = InetAddress.getLocalHost().getHostName();
    logger.info("Called hello on {}", hostname);
    return repository.hello() + " via " + hostname;
  }
}
