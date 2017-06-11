package com.company;

class Animal {
    String name;
    String location;
    String food;
    String gender;
    int lifetime;

    void Print() {
        System.out.println(name + ":" + " location - " + location + " food - " + food + " gender - " + gender + " lifetime - " + lifetime);

    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal lion = new Animal();
        lion.name = "Lion";
        lion.location = "Africa";
        lion.food = "meat";
        lion.gender = "male";
        lion.lifetime = 15;


        Animal cow = new Animal();
        cow.name = "Cow";
        cow.location = "All world";
        cow.food = "grass";
        cow.gender = "female";
        cow.lifetime = 20;


        lion.Print();
        cow.Print();

    }
}
