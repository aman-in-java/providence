package org.atn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Website application
 */
@SpringBootApplication
@ComponentScan
public class WebsiteApplication
{
  public static void main(final String[] args)
  {
    SpringApplication.run(WebsiteApplication.class, args);
  }
}
