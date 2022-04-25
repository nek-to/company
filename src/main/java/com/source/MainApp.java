package com.source;

public class MainApp {
    public static void main(String[] args) {
        Company company = new Company("Bakerry Street");
        User user = new User("Nik", 111, company);

        user.printInfo();
    }
}
