package com.example.restbody;

public class Country {//Передача обьектов в теле HTTP-ответа

    //определяющий объект Country. При использовании объекта (такого как Country) в качестве модели данных,
    //передаваемых между двумя приложениями, его принято называть DTO (data transfer
    //object — объект передачи данных). Нашим DTO является объект Country,
    //экземпляры которого созданная конечная точка REST будет возвращать в теле
    //HTTP-ответа.

    private String name;
    private int population;

    public static Country of(String name, int population){
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }
    //Чтобы было проще, мы определили для экземпляра Country статический
    //метод генерации объекта, который принимает название страны и количество
    //жителей и возвращает экземпляр Country с указанными значениями

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public String getName() {
        return name;
    }
}
