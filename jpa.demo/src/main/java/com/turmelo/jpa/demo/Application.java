package com.turmelo.jpa.demo;

import com.turmelo.jpa.demo.model.Automovel;
import com.turmelo.jpa.demo.model.Marca;
import com.turmelo.jpa.demo.model.Modelo;
import com.turmelo.jpa.demo.repository.AutomovelRepository;
import com.turmelo.jpa.demo.repository.MarcaRepository;
import com.turmelo.jpa.demo.repository.ModeloRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(AutomovelRepository automovelRepository, MarcaRepository marcaRepository, ModeloRepository modeloRepository) {
		return (args) -> {
			LOGGER.info("Salvando marcas...");
			Marca volkswagen = new Marca("Volkswagen");
			Marca fiat = new Marca("Fiat");
			Marca ford = new Marca("Ford");
			marcaRepository.saveAll(Arrays.asList(volkswagen, fiat, ford));
			LOGGER.info("Marcas salvas:");
			marcaRepository.findAll().forEach(marca -> LOGGER.info(marca.toString()));

			LOGGER.info("Salvando modelos...");
			Modelo gol = new Modelo("Gol bola, ac", 1000, volkswagen);
			Modelo uno = new Modelo("Possui escada", 8000, fiat);
			Modelo ka = new Modelo("Baratinha anos 2000", 500, ford);
			modeloRepository.saveAll(Arrays.asList(gol, uno, ka));
			LOGGER.info("Modelos salvos:");
			modeloRepository.findAll().forEach(modelo -> LOGGER.info(modelo.toString()));

			LOGGER.info("Salvando automoveis...");
			Automovel automovel1 = new Automovel(1998, 1999, "Sem observacoes", 8.000F, 100000, gol);
			Automovel automovel2 = new Automovel(2000, 2001, "TEM ESCADA!", 10.000F, 100, uno);
			Automovel automovel3 = new Automovel(2003, 2004, "...", 3.000F, 50000, ka);
			automovelRepository.saveAll(Arrays.asList(automovel1, automovel2, automovel3));
			LOGGER.info("Automoveis salvos:");
			automovelRepository.findAll().forEach(automovel -> LOGGER.info(automovel.toString()));
		};
	}

}
