package ru.micron.spring.security.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan(basePackages = "ru.micron.spring.security")
@EnableWebMvc
public class Config {

  @Bean
  public DataSource dataSource() {
    ComboPooledDataSource dataSource = new ComboPooledDataSource();
    try {
      dataSource.setDriverClass("org.h2.Driver");
      dataSource.setJdbcUrl(
          "jdbc:h2:mem:;INIT=RUNSCRIPT FROM 'classpath:init.sql';DB_CLOSE_DELAY=-1;");
    } catch (PropertyVetoException e) {
      e.printStackTrace();
    }
    return dataSource;
  }

  @Bean
  ViewResolver viewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setPrefix("/WEB-INF/view/");
    viewResolver.setSuffix(".jsp");
    return viewResolver;
  }
}
