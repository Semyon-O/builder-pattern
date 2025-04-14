package ru.semyon.person;

public class ChildBuilder {
    private String name;
    private final String surname;
    private final String address;

    public ChildBuilder(String surname, String address) {
        this.surname = surname;
        this.address = address;
    }

    public ChildBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Person build() {
        if (this.name == null) {
            throw new IllegalStateException("Name is required");
        }
        Person person = new Person(name, surname);
        person.setAddress(this.address);
        person.age=1;
        return person;
    }
}
