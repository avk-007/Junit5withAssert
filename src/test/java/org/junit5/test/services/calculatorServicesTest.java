package org.junit5.test.services;
import org.junit.jupiter.api.*;

import java.util.Date;

public class calculatorServicesTest {

    //execute the logic before all the test cases
    @BeforeAll
    public static void init(){
        System.out.println("this is a single time logic");

    }
    @AfterAll
    public static void cleanUp(){
        System.out.println("after all the test cases");
    }
//before every test method chale to

    @BeforeEach
    public  void eachTestCase(){
        System.out.println("beforeEach");
    }

    @AfterEach
    public  void afterTestCase() {
        System.out.println("afterEach");
    }

    @Test
    //to change the name of the test case we use @DisplayName
    //@DisplayName("this is custom name")
    public void addTwoNumbersTest(){
        System.out.println("first test case");
        int actual=calculatorServices.addTwoNumbers(12,12);
        int expected=24;
        System.out.println("test passed of addtwonumbers");
        //we can also add failure messages
        Assertions.assertEquals(expected,actual ," test failed");
    }

    @Test
   //to disable the test case
    // @Disabled
    public void sumAnyNumbersTest(){
        System.out.println("second test case");
         int actual=calculatorServices.sumAnyNumbers(4,4,4,4);
         int expected=16;
        System.out.println("test passed of sumAnyNumbers");
         Assertions.assertEquals(expected,actual ," test failed");
    }

    //@tag
    //@Nested
    // @TestFactory method

}


//junit 5 common annotations

//@tag---@Tag annotation refer txt file----------