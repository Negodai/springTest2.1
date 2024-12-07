package ru.springTest.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;


@ComponentScan(value = "ru.springTest.shapeDraw")
@PropertySource("project.properties")
public class DrawConfig {

}
