package com.example.server;

import com.example.server.enumeration.Status;
import com.example.server.model.Server;
import com.example.server.repo.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ServerRepository repository){
		return args -> {
			repository.save(new Server(null,"192.168.1.160", "Ubuntu Linux", "16 GB", "Personal Pc",
					"http://localhost:8080/server/image/server1.png", Status.SERVER_UP));
			repository.save(new Server(null,"192.168.1.58", "Fedora Linux", "16 GB", "Dell Pc",
					"http://localhost:8080/server/image/server2.png", Status.SERVER_UP));
			repository.save(new Server(null,"192.168.1.21", "MS 2008", "32 GB", "Personal Pc",
					"http://localhost:8080/server/image/server3.png", Status.SERVER_UP));
			repository.save(new Server(null,"192.168.1.31", "AWS", "64 GB", "AWS cloud",
					"http://localhost:8080/server/image/server4.png", Status.SERVER_UP));
		};
	}

}
