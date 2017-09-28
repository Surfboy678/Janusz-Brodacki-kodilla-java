package com.kodilla.patterns.singleton;



import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void logged(){

        Logger.getInstance().log("******");
    }

    @Test
    public  void testLastLog(){

        //Given
        String lastLog = Logger.getInstance().getLastLog();

        //When
        System.out.println("Last log:" + lastLog);

        //Then
        Assert.assertEquals("******", lastLog);



    }


}
