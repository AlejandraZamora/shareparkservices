package edu.eci.cosw.sharepark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EnableJpaRepositories("edu.eci.cosw.sharepark.repositories")
@EntityScan("edu.eci.cosw.sharepark.entities")
public class ShareParkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShareParkApplication.class, args);
	}

}