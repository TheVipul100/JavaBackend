package practice;

import java.io.Serializable;

public class Animal {                           // NOT Serializable
    String species = "unknown";  // this isnt serialised so at deserialization this no arg will be invoked and dog const. wont
    Animal()
    {
        System.out.println("Animal no-arg constructor");
        species = "unknown";
    }
}

class Dog extends Animal implements Serializable  // Serializable
{
    private static final long serialVersionUID = 1L;
    String name;
    Dog(String name, String species)
    {
        super();
        this.name = name;
        this.species = species;
    }
}
