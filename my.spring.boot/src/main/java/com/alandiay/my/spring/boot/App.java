package com.alandiay.my.spring.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
@Import(SwaggerConfig.class)
public class App {

    @RequestMapping("/")
    @ResponseBody
    List<Personne> home() {
    	
    	List<Personne> personnes =  new ArrayList<Personne>();
    	personnes.add(new Personne("ndiaye", "alassane"));
    	personnes.add(new Personne("sow", "khadidja"));
    	//personnes.forEach(System.out::println);
        return personnes;
    }
    
    
   

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
        
    }
}
