package cat.itacademy.barcelonactiva.amorlopez.christian.s05.t01.n03.S05T01N03AmorLopezChristian.model.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class FlorConfig {

	@Bean
	public WebClient webClient() {
		return WebClient.builder().baseUrl("http://localhost:9001").build();
	}
}
