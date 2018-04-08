package com.league;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import com.league.dao.LeagueRepository;

@SpringBootApplication
public class LeagueStartApplication implements CommandLineRunner {

	@Resource
	com.league.uploads.StorageService storageService;

	public static void main(String[] args) {
		SpringApplication.run(LeagueStartApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		//storageService.deleteAll();
		//storageService.init();
	}
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/*").allowedOrigins("http://localhost:4200")
                .maxAge(3600)
                .allowedMethods("GET", "POST", "DELETE","OPTIONS", "PUT");
                        
            }
        };
    }
}

