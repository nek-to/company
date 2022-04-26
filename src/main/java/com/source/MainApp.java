package com.source;

import com.custom_exception.IncorrectAgeException;

public class MainApp {
    public static void main(String[] args) throws IncorrectAgeException {
        Company company = new Company("Bakerry Street");
        User user = new User("Nik", 1, company);

        user.printInfo();
        user.exceptionPrintInfo();
    }
}
