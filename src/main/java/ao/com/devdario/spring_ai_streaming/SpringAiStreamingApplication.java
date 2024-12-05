package ao.com.devdario.spring_ai_streaming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("file:${user.dir}/.env")
public class SpringAiStreamingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAiStreamingApplication.class, args);
	}

}
