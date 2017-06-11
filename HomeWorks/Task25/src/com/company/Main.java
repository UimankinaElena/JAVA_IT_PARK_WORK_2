package com.company;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Жукова Полина","женский", 27, 55, 165);
        System.out.println(human.getName());
        System.out.println(human.getGender());
        System.out.println(human.getAge());
        System.out.println(human.getWeight());
        System.out.println(human.getHeight());
    }
}

