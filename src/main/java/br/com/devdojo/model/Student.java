package br.com.devdojo.model;

/**
 * Created by eduardomunareto on 13/09/21.
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
