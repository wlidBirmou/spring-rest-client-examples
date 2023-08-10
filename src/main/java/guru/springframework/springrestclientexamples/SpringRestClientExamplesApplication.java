package guru.springframework.springrestclientexamples;

import guru.springframework.springrestclientexamples.services.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Collections;

@SpringBootApplication
@Slf4j
public class SpringRestClientExamplesApplication {



	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringRestClientExamplesApplication.class, args);
		context.getBean("userController");
	}
}
