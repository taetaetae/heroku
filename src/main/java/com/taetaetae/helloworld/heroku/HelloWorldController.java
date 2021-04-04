package com.taetaetae.helloworld.heroku;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/")
  public String helloWorld() {
    return "hello world!! time : " + LocalDateTime.now();
  }

}
