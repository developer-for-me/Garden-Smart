package ro.abstractPerson;

import java.util.Comparator;

public class Person {
    private String name;
    private int age;
    private String cnp;
    private String password;

    public Person(String name,String cnp){
        this.name = name;
        this.cnp = cnp;
    }

    public String compareTo(Person o) {
        return (this.name!= o.name)?"NU este":"Este egal";
    }
}

