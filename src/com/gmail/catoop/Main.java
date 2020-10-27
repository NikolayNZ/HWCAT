package com.gmail.catoop;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setAge(9);
        cat1.setName("Мурчик");
        cat1.setBreed("Kao-mani");
        cat1.voice();
        System.out.println(cat1);

        Cat cat2 = new Cat();
        cat2.setAge(4);
        cat2.setName("Пантера");
        cat2.setBreed("Maine Coon");
        cat2.voice();

        System.out.println(cat2);
    }
}
