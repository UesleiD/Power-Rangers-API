package com.imed.primeiro.projeto;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(PowerRangersRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new PowerRangers("Ricardo Ogliari", "Ranger Ping")));
      log.info("Preloading " + repository.save(new PowerRangers("Jason", "Ranger Vermelho I")));
      log.info("Preloading " + repository.save(new PowerRangers("Zack", "Ranger Preto I")));
      log.info("Preloading " + repository.save(new PowerRangers("Billy", "Ranger Azul")));
      log.info("Preloading " + repository.save(new PowerRangers("Trini", "Ranger Amarela I")));
      log.info("Preloading " + repository.save(new PowerRangers("Kimberly", "Ranger Rosa I")));
      log.info("Preloading " + repository.save(new PowerRangers("Tommy", "Ranger Verde")));
      log.info("Preloading " + repository.save(new PowerRangers("Rocky", "Ranger Vermelho")));
      log.info("Preloading " + repository.save(new PowerRangers("Adam", "Ranger Preto II")));
      log.info("Preloading " + repository.save(new PowerRangers("Aisha", "Ranger Amarela II")));
      log.info("Preloading " + repository.save(new PowerRangers("Katherine", "Ranger Rosa II")));
    };
  }
}