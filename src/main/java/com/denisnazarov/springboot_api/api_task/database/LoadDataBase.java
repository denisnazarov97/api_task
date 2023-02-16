package com.denisnazarov.springboot_api.api_task.database;

import com.denisnazarov.springboot_api.api_task.model.Client;
import com.denisnazarov.springboot_api.api_task.model.Quote;
import com.denisnazarov.springboot_api.api_task.repository.ClientRepository;
import com.denisnazarov.springboot_api.api_task.repository.QuoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDataBase {

    private static final Logger log =
            LoggerFactory.getLogger(LoadDataBase.class);

//    @Bean
//    CommandLineRunner initDataBase(ClientRepository repository){
//
//        return args -> {
//
//            log.info("Preloading " + repository.save(new Client("Sergey",
//                    "serg@gmail.com", "qwerty")));
//            log.info("Preloading " + repository.save(new Client("Ivan",
//                    "vanya@gmail.com", "qwerty")));
//        };
//    }

//    @Bean
//    CommandLineRunner init2DataBase(QuoteRepository repository){
//
//        return args -> {
//
////            log.info("Preloading " + repository.save(Quote.createQuote()));
////            log.info("Preloading " + repository.save(new Quote("Hello i am Ivan.Nice to meet you!", 0)));
//        };
//    }


}
