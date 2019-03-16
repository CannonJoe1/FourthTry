/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class UnitTestDemoTest {
    
    public UnitTestDemoTest() {
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
     * Test of main method, of class UnitTestDemo.
     */
    @Test
    public void testMain() {
        System.out.println("");
        String[] args = null;
        UnitTestDemo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastChar method, of class UnitTestDemo.
     */
    @Test
    public void testGetLastChar() {
        System.out.println("getLastChar");
        String testString = "Anastasia";
        String expResult = "a";
        String result = UnitTestDemo.getLastChar(testString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //assertArrayEquals
    @Test
    public void testEqualIntArrays() {
        int[] odds = new int[] {1,3,5,7};
        int[] timesTwo = new int[] {2,6,10,14};
        int[] doubleOdds = UnitTestDemo.doubleIntArray(odds);        
        assertArrayEquals(timesTwo, doubleOdds);
    }
    
    //assertFalse
    @Test
    public void testDifferentFirstAndLastChar() {
        System.out.println("testDifferentFirstAndLastChar");
        String testString = "Anastasia";
        assertFalse(UnitTestDemo.getFirstChar(testString).equals(UnitTestDemo.getLastChar(testString)));
    }
    
    //assertNotNull
    @Test
    public void testNotNullArray() {
        System.out.println("testNotNullArray");
        int[] odds = new int[] {1,3,5,7};
        int[] doubleOdds = UnitTestDemo.doubleIntArray(odds);
        assertNotNull(doubleOdds);
    }
    
    //assertNotSame
     @Test
    public void testDifferentObjects() {
        System.out.println("testDifferentObjects");
        int[] odds = new int[] {1,3,5,7};
        int[] doubleOdds = UnitTestDemo.doubleIntArray(odds);
        assertNotSame(odds, doubleOdds);
        }
    
    //assertEquals(double expected, double actual, double delta) 
    @Test
        public void testArrayLengths() {
        System.out.println("testArrayLengths");
        int[] odds = new int[] {1,3,5,7};
        int[] doubleOdds = UnitTestDemo.doubleIntArray(odds);
        assertEquals(odds.length, doubleOdds.length);
        }
    
    /**
     * Test of getFirstChar method, of class UnitTestDemo.
     */
    @Test
    public void testGetFirstChar() {
        System.out.println("getFirstChar");
        String testString = "Anastasia";
        String expResult = "A";
        String result = UnitTestDemo.getFirstChar(testString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getVowelCount method, of class UnitTestDemo.
     */
    @Test
    public void testGetVowelCount() {
        System.out.println("getVowelCount");
        String testString = "Anastasia";
        boolean trackLowerCase = false;
        int expResult = 5;
        int result = UnitTestDemo.getVowelCount(testString, trackLowerCase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeralCount method, of class UnitTestDemo.
     */
    @Test
    public void testGetNumeralCount() {
        System.out.println("getNumeralCount");
        String testString = "THX1138";
        int expResult = 4;
        int result = UnitTestDemo.getNumeralCount(testString);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
