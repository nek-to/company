package com.source;

import com.custom_exception.IncorrectAgeException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    Company company;
    User user;

    @Test(expected = AssertionError.class)
    public void printInfo_failure() {
        //Given
        company = new Company("Bekkery Street");
        user = new User("Nik", 20, company);
        //When
        user.printInfo();
        //Then
    }

    @Test(expected = IncorrectAgeException.class)
    public void exceptionPrintInfo_failure(){
        //Given
        company = new Company("Berry Street");
        user = new User("Den", 101, company);
        //When
        user.exceptionPrintInfo();
    }
}
