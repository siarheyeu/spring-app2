package ru.siarheyeu.springcourse;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.siarheyeu.springcourse")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
