package com.tfa;

import java.util.function.Consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ConsumerMQ {

	@Bean
	public Consumer<String> consume(){

		return input ->{
			log.info("#########################");
			log.info(input);
			log.info("#########################");
		};
		
	}
}
