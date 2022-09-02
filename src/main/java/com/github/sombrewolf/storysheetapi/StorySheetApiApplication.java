package com.github.sombrewolf.storysheetapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class StorySheetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorySheetApiApplication.class, args);
	}

}
