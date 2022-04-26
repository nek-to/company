package com;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class JUnit4TestException {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test1() throws Exception {
        Foo foo = new Foo();
        thrown.expect(Exception.class);
        thrown.expectMessage("Exception Message");
        foo.foo();
    }
}
