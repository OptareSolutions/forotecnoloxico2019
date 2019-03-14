package com.optaresolutions.demos.forouvigo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
  
  @RequestMapping
  public void sayHello(@RequestParam String name) {
    LOGGER.info(name);
  }
}
