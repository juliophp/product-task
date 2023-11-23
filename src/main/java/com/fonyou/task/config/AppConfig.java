package com.fonyou.task.config;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.modelmapper.config.Configuration.AccessLevel.PRIVATE;

@Getter
@Setter
@Configuration
@EnableScheduling
@EnableAsync
public class AppConfig {
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration()
		.setMatchingStrategy(MatchingStrategies.STRICT)
		.setFieldMatchingEnabled(true)
		.setSkipNullEnabled(true)
		.setFieldAccessLevel(PRIVATE);
		return mapper;
	}
}