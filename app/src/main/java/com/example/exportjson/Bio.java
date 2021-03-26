package com.example.exportjson;

public class Bio {

    private final String name;
    private final String age;
    private final String hobby;

    public Bio(String name, String age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }
}
