package com.example.torneo;

import com.example.torneo.model.Equipo;
import com.example.torneo.model.Torneo;
import com.example.torneo.model.TorneoUnaRonda;
import com.example.torneo.model.fixture.Fixture;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TorneoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TorneoApplication.class, args);
	}

}
