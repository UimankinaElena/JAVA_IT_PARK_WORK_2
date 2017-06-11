package com.company;

/**
 * Created by Елена on 13.05.2017.
 */
public class Human {

    private String name;
    private String gender;
    private int age;
    private int weight;
    private int height;


    public Human(String name, String gender, int age, int weight, int height) {
        this.setName(name);
        this.setGender(gender);
        this.setAge(age);
        this.setWeight(weight);
        this.setHeight(height);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void setAge(int age) {
        if ((age > 0) && (age < 130)) {
            this.age = age;
        } else System.err.println("Некорректные данные");

    }

    public void setWeight(int weight) {
        if ((weight > 0) && (weight < 700)) {
            this.weight = weight;
        } else System.err.println("Некорректные данные");
    }

    public void setHeight(int height) {
        if ((height > 0) && (height < 350)) {
            this.height = height;
        } else System.err.println("Некорректные данные");
    }


    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

}




