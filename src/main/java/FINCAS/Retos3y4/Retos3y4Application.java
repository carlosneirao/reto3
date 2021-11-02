

package FINCAS.Retos3y4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"FINCAS.Retos3y4"})
public class Retos3y4Application {

	public static void main(String[] args) {
		SpringApplication.run(Retos3y4Application.class, args);
	}

}
