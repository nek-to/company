package com.source;

import com.custom_exception.IncorrectAgeException;

public class User {
    private String name;
    private int age;
    private Company company;

    public User() {
    }

    public User(String name, int age, Company company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String exceptionPrintInfo() {
        if (age > 100) {
            try {
                throw new IncorrectAgeException("Your age more then 100 -> " + age);
            } catch (IncorrectAgeException e) {
                e.printStackTrace();
            }
        }
        return name + " " + age + " " + company;
    }

    public String printInfo() {
        return name + " " + age + " " + company;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + company;
    }
}
