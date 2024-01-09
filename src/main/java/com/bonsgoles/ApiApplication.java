package com.bonsgoles;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.bonsgoles.model.Pedidos;
import com.bonsgoles.repository.PedidosRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com")
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(PedidosRepository pedidosRepository) {
        return args -> {
            pedidosRepository.deleteAll();

            Pedidos c = new Pedidos();
            c.setName("Leonardo Paniz");
            c.setPrice(250);
            c.setDate("28/01/2006");
            c.setStatus("Em análise");

            pedidosRepository.save(c);

        };
    }
}
