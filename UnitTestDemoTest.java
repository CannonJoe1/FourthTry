/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestdemo;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cannon
 */
public class UnitTestDemoTest {
    
    public UnitTestDemoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UnitTestDemo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetLastChar() {
        System.out.println("getLastChar");
        String testString = "CurrentControlSet";
        String expResult = "t";
        String result = UnitTestDemo.getLastChar(testString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetFirstChar() 
    {
        System.out.println("getFirstChar");
        String testString = "Bananarama";
        String expResult = "B";
        String result = UnitTestDemo.getFirstChar(testString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        
    }

    @Test
    public void testGetVowelCount() {
        System.out.println("getVowelCount");
        String testString = "abcdEfghIjklmnOpqrstuvwxyz";
        boolean trackLowerCase = false;
        int expResult = 5;
        int result = UnitTestDemo.getVowelCount(testString, trackLowerCase);
        assertEquals(expResult, result);
        
        trackLowerCase = true;
        expResult = 2;
        result = UnitTestDemo.getVowelCount(testString, trackLowerCase);
        assertEquals(expResult, result);        
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testGetNumeralCount() {
        System.out.println("getNumeralCount");
        String testString = "1a2b3c4D5e6F7g8h9i";
        int expResult = 9;
        int result = UnitTestDemo.getNumeralCount(testString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    // types of asserts
    // assertEquals
    // assertNull
    // assertSame
    // assertTrue
    // fail
    
    // BICEP
    // Boundary
    // Inverse
    // Cross check
    // Force Errors
    // Performance
    
    // to create a unit test class in NetBeans
    // Give focus to the class for which you want to create a new unit test class
    // Tools\Create/Update Tests 
}
