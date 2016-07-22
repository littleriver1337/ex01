package testStreams;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.boot.SpringApplication;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import testStreams.model.Product;
import testStreams.model.Info;


@RestController
@SpringBootApplication
public class TestStreams01Application {
	public static void main(String[] args) {
		SpringApplication.run(TestStreams01Application.class, args);
	}

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
}
