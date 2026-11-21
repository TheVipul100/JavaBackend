package eCommerceSerialized;

import java.io.Serializable;

public class Address implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String city;
    private String pin;
    private String street;

    public Address(String city, String pin, String street) {
        this.city = city;
        this.pin = pin;
        this.street = street;
    }

    @Override
    public String toString()
    {
        return city + " " + street + " " + pin ;
    }
}
