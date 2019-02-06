package com.sndevops.eng;
import org.junit.Assert;
import org.junit.Test; 

public class AppTest {

    private String INPUT = "123456891011";
    @Test 
    public void testLength() { 
        Assert.assertEquals(INPUT,"123456891011");
    }
}
