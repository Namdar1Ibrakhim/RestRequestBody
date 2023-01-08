package com.example.restbody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountyController {

    @GetMapping("/france") //Связываем действие контроллера с HTTP-методом GET и путем /france
    public Country france(){
        Country c = Country.of("France", 67);
        return c;
        // в теле ответа можно возвращать сам обьект тогда передастса в формате JSON
        // JavaScript Object Notation (JSON) — это простой
        // способ представления строк в виде пар «атрибут — значение»
    }

    @GetMapping("/all")
    public List<Country> countries(){
        Country c1 = Country.of("France", 67);
        Country c2 = Country.of("Spain", 47);
        return List.of(c1, c2);//метод листа ложет все в лист
    }
    @PostMapping("/all")
    public String all(@RequestParam String a){
        return a;
    }
}
