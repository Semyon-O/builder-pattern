package ru.semyon.person;

public class PersonBuilder {

    protected String name = null;
    protected String surname = null;
    protected Integer age = null;
    protected String address = null;

    public PersonBuilder() {}

    public Person build() {

        if (this.name == null) {
             throw new IllegalStateException("Not provided attribute name");
        }
        if (this.surname == null) {
            throw new IllegalStateException("Not provided attribute surname");
        }
        if (this.age <= 0) {
            throw new IllegalArgumentException("Age cannot be lower 0");
        }

        Person person = new Person(this.name, this.surname, this.age);
        person.setAddress(this.address);
        return person;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

}
