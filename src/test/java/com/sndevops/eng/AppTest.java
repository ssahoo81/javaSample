package com.sndevops.eng;
import org.junit.Assert;
import org.junit.Test; 

public class AppTest {

    private String INPUT = "12345689";
    @Test 
    public void testLength() {
        // new commit
        Assert.assertEquals(INPUT,"12345689");
    }
}
