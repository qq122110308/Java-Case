package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bean.TestBean;

@Configuration   //表明这是一个配置类
public class TestConfig {
	
	@Bean
	public  TestBean  testbean(){
		return new TestBean("Hello World");
	}
}
