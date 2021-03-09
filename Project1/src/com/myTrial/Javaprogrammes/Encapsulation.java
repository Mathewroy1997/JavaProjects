package com.myTrial.Javaprogrammes;

import com.sun.tools.attach.AgentInitializationException;

public class Encapsulation {

    private String name;
    private int age;
//getter methods defining:
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
//setter method defining:
    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

}

