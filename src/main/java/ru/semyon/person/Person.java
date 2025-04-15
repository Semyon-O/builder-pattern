package ru.semyon.person;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age = null;
    protected String address = null;



    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setAge(1)
                .setSurname(this.surname);
    }


    public boolean hasAge() {
        return this.age != null;
    }
    public boolean hasAddress() { return this.address != null; }

    public String getName() { return this.name; }
    public String getSurname() { return this.surname; }
    public OptionalInt getAge() {
        return OptionalInt.of(this.age);
    }
    public String getAddress() { return this.address; }

    public void setAddress(String address) { this.address = address; }
    public void happyBirthday() { this.age += 1; }

    @Override
    public String toString() {
        return String.format("name: %s, surname: %s, age: %d", this.name, this.surname, this.age);
    }

}