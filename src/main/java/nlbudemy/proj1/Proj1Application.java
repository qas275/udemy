package nlbudemy.proj1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//contains multiple annotations including component scan
//component scanning scans every package within same base package as this file
//to enable scanning of other packages, need to include (scanBasePackages = "com.love2code.util","org.acme.cart") 
@SpringBootApplication()
public class Proj1Application {

	public static void main(String[] args) {
		SpringApplication.run(Proj1Application.class, args);
	}

}
