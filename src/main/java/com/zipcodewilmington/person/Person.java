package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private double height;
    private boolean male;
    private boolean happy;
    private String hairColor;
    private String eyeColor;

    public Person() {
    this.name = "";
    this.age = Integer.MAX_VALUE;
    this.height = 62;
    this.male = true;
    this.happy = true;
    this.hairColor = "brown";
    this.eyeColor = "blue";
    }

    public Person(int age) {
        name = "";
        setAge(age);
    }

    public Person(String name) {
        this.name = "Leon";
        this.age = Integer.MAX_VALUE;
    }

    public Person(String name, int age) {
        this.name = "Leon";
        this.age = 5;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }
}
