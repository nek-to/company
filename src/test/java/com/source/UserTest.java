package com.source;

import com.custom_exception.IncorrectAgeException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    Company company;
    User user;

    @Test
    public void printInfo_failure(){
        //Given
        company = new Company("Bekkery Street");
        user = new User("Nik", 20, company);
        //When
        user.printInfo();
        //Then
    }

    @Test(expected = IncorrectAgeException.class)
    public void exceptionPrintInfo_failure() throws IncorrectAgeException{
        //Given
        company = new Company("Berry Street");
        user = new User("Den", 101, company);
        //When
        user.exceptionPrintInfo();
    }

    @Test
    public void exceptionPrintInfo_success() throws IncorrectAgeException {
        //Given
        company = new Company("Berry Street");
        user = new User("Den", 12, company);
        //When
        user.exceptionPrintInfo();
    }
}
