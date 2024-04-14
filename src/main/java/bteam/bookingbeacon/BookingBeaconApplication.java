package bteam.bookingbeacon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @EnableAutoConfiguration, @ComponentScan, @Configuration 를 하나로 묶은 어노테이션
public class BookingBeaconApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingBeaconApplication.class, args);
	}

}
