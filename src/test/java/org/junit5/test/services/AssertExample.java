package org.junit5.test.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.management.RuntimeErrorException;
import java.util.Arrays;
import java.util.List;


public class AssertExample {
    //assert ka matlb--validating actual result with expected result is assertions mainly same or not
    //assertion classs hai
    //to perform assertion we have to use-- import org.junit.jupiter.Assertions;


    @Test
    public void test1() {
        System.out.println("testing some assertion methods");

//        int actual=10;
//        int expected=10;

        float actual = 10;
        float expected = 10.0f;
        //most of the methods are overloaded methods

        // Assertions.assertEquals(expected,actual);

//        int []actualIntArray={1,2,3,4,5};
//        int []expectedIntArray={1,2,3,4,5};
//        Assertions.assertArrayEquals(expectedIntArray,actualIntArray);


//        String name=new String("abhishek");
//        String expectedName=new String("abhishek");
//        //Assertions.assertSame(expectedName,name);
//        Assertions.assertEquals(expectedName,name);

//        String name="abhishek";
//        String expectedName="abhishek";
//        //Assertions.assertSame(expectedName,name);
//        Assertions.assertEquals(expectedName,name);

        //assert null
        //Assertions.assertNull();

        //assert not null
        // Assertions.assertNotNull();

        //true or false

//        //assert same

//        String name="abhishek";
//        String expectedName="abhishek";
//        //Assertions.assertSame(expectedName,name);
//        Assertions.assertSame(expectedName,name);

//true false
//        boolean actualBoolean=true;
//         boolean expectedBoolean=true;
//        System.out.println("true pass");
//        Assertions.assertTrue(actualBoolean);
//        Assertions.assertEquals(expectedBoolean,actualBoolean);
//
//        //assert false
//        actualBoolean=false;
//        expectedBoolean=false;
//        System.out.println("false pass");
//        Assertions.assertFalse(actualBoolean);
//        Assertions.assertEquals(expectedBoolean,actualBoolean);
//
//        //assert true
//        actualBoolean=true;


        //for list of integers

//        List<Integer> list=Arrays.asList(1,2,3,4,5);
//         List<Integer> expectedList= Arrays.asList(1,2,3,4,5);
//        //Assertions.assertSame(expectedList,list);
//        Assertions.assertIterableEquals(expectedList,list);

        //to handle exception condition

//        Assertions.assertThrows(NullPointerException.class, () -> {
//            String name = null;
//            String expectedName = "abhishek";
//            System.out.println("exception test case passed");
//            //Assertions.assertSame(expectedName,name);
//            Assertions.assertEquals(expectedName, name);
//        });

        //exception
        Assertions.assertThrows(RuntimeException.class, () ->
        {
           // System.out.println("this is testing executable");
            throw new RuntimeException("this is testing exception");
        });


    }
}
