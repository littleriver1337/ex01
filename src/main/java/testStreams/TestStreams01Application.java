package testStreams;


import io.katharsis.resource.registry.ResourceRegistry;
import io.katharsis.spring.boot.KatharsisConfigV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.boot.SpringApplication;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import testStreams.persistence.model.Product;
import testStreams.persistence.model.Info;

import java.util.HashMap;
import java.util.Map;

@Configuration
@RestController
@SpringBootApplication
@Import(KatharsisConfigV2.class)
public class TestStreams01Application {

	@RequestMapping(value = "/api/info", method = RequestMethod.POST)
	public void login(
			@RequestBody Info info,
			HttpServletRequest request,
			HttpServletResponse response) {
	}

	@RequestMapping(value = "/api/product", method = RequestMethod.GET)
	public void product(
			@RequestBody Product product,
			HttpServletRequest request,
			HttpServletResponse response) {
	}


	@Autowired
	private ResourceRegistry resourceRegistry;

	@RequestMapping("/resourceInfo")
	public Map<?, ?> getResources() {
		Map<String, String> result = new HashMap<>();

		for (Class<?> clazz : resourceRegistry.getResources().keySet()) {
			result.put(resourceRegistry.getResourceType(clazz), resourceRegistry.getResourceUrl(clazz));
		}
		return result;
	}

//	@Bean
//	public FilterRegistrationBean corsFilter() {
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration config = new CorsConfiguration();
//		config.setAllowCredentials(true);
//		config.addAllowedOrigin("*");
//		config.addAllowedHeader("*");
//		config.addAllowedMethod("OPTIONS");
//		config.addAllowedMethod("HEAD");
//		config.addAllowedMethod("GET");
//		config.addAllowedMethod("PUT");
//		config.addAllowedMethod("POST");
//		config.addAllowedMethod("DELETE");
//		config.addAllowedMethod("PATCH");
//		source.registerCorsConfiguration("/**", config);
//		final FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
//		bean.setOrder(0);
//		return bean;
//	}
public static void main(String[] args) {
	SpringApplication.run(TestStreams01Application.class, args);
	}
}

