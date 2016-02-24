/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vladimir
 */
public class NewClass1Test {
    
    public NewClass1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of returnValue1 method, of class NewClass1.
     */
    @Test
    public void testReturnValue1() {
        System.out.println("returnValue1");
        NewClass1 instance = new NewClass1();
        int expResult = 50;
        int result = instance.returnValue1();
        assertEquals(expResult, result);
        
    }
    
}
