package br.com.alura.screenmatch;

import br.com.alura.screenmatch.models.DataSerie;
import br.com.alura.screenmatch.service.ConverterData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.alura.screenmatch.service.ConsumerApi;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumer = new ConsumerApi();
        var json = consumer.obterDados("https://omdbapi.com/?t=gilmore+girls&Seanson=1&apikey=a2c3ac8a");
        System.out.println(json);
        ConverterData conversor = new ConverterData();
        DataSerie dados = conversor.obterDados(json, DataSerie.class);
        System.out.println(dados);
    }
}
