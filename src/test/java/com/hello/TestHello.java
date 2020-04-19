package com.hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.hello.Helloworld;

public class TestHello extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestHello( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( com.hello.TestHello.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testHelloWorld()
    {
        assertEquals("Hello", Helloworld.sayHello());
        assertEquals("Hello", Helloworld.sayHello()); 
    }

}
