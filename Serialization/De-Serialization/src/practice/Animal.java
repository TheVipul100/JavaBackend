package practice;

import java.io.Serializable;

public class Animal  {                           // NOT Serializable
    String species = "";
    Animal()
    {
        System.out.println("Animal no-arg constructor");
        species = "unknown";
    }

    public String getSpecies() {
        return species;
    }
}

class Dog extends Animal implements Serializable  // Serializable   // object of this class will be centralised if we share it to other person
{
    private static final long serialVersionUID = 1L;
    String name;
    Dog(String name, String species)
    {
        this.name = name;
        this.species = species;
    }
}

/*
* What Animal declares	What happens on deserializing a Dog
 No constructor at all	The compiler’s default constructor exists and runs. Fields get their initializer value, or null/0/false. Works.
 An explicit no-arg constructor	It runs. Works.
 Only Animal(String species)	No no-arg constructor exists, since writing any constructor removes the default.
*
* InvalidClassException: no valid constructor.
*
*
* Corrected mental model
*
   1--Serialization saves only the layers whose classes implement Serializable.
   2--A field belongs to the class that declares it, no matter who assigns it.
   3--Non-serializable parent layers are rebuilt by running their no-arg constructor, so they come back with initializer or default values.
   4--If that parent has no usable no-arg constructor (and the compiler didn’t supply a default), deserialization fails with InvalidClassException.
*
*
* In memory the Dog object holds both fields, but they belong to different layers:

Dog object in memory
 ├── Animal part:  species = "Labrador"   <- not serializable, NOT written to the stream
 └── Dog part:     name = "Bruno"         <- serializable, written to the stream
* */

