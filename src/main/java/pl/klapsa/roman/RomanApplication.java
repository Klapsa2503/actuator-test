package pl.klapsa.roman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class RomanApplication {

	public static void main(String[] args) {
		SpringApplication.run(RomanApplication.class, args);
	}

}
