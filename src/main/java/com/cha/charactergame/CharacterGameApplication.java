package com.cha.charactergame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
public class CharacterGameApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

  public static void main(String[] args) {
    try {
      SpringApplication.run(CharacterGameApplication.class, args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  protected WebApplicationContext run(SpringApplication application) {

    return super.run(application);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(CharacterGameApplication.class);
  }

}
