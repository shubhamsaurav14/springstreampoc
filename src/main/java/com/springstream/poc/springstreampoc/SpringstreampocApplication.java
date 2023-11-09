package com.springstream.poc.springstreampoc;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringstreampocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringstreampocApplication.class, args);
	}

    @Bean
    Consumer<String> receive() {
		return s -> log.info("kafka2 Data received..." + s);
	}

	@Bean
    Consumer<String> process() {
		return s -> log.info("kafka1 Data received..." + s);
	}

}