package com.gmail.catoop;

public class Cat {
    private int age;
    private String breed;
    private String name;

    public Cat() {
    }

    public Cat(int age, String breed, String name) {
        this.age = age;
        this.breed = breed;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void voice(){
        System.out.println("Miay-Miay");
    }


    public String toString() {
        return "Кіт: Вік = " + age + "," + " порода = " + breed + ", ім'я = " + name +"";
    }
}
