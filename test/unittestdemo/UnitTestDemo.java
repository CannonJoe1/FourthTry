/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestdemo;

import java.util.Arrays;

/**
 *
 * @author Cannon
 */
public class UnitTestDemo 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String lastCharacter = getLastChar("Anastasia");
        System.out.println("Last character of \"Anastasia\" is " + lastCharacter);
        
        String firstCharacter = getFirstChar("Anastasia");
        System.out.println("First character of \"Anastasia\" is " + firstCharacter);
        
        int vowelCount = getVowelCount("Anastasia", false);
        System.out.println("Mixed case vowel count in \"Anastasia\" is " + vowelCount);
        
        vowelCount = getVowelCount("Anastasia", true);
        System.out.println("Lower case vowel count in \"Anastasia\" is " + vowelCount);
        
        int numeralCount = getNumeralCount("THX1138");
        System.out.println("Numeral count in \"THX1138\" is " + numeralCount);
        
    }
    
    /**
     * Returns the last character in the string argument
     * Test for empty string
     * @param testString
     * @return 
     */
    public static String getLastChar(String testString)
    {
        String lastChar = testString.substring((testString.length()-1));
        return lastChar;
    }
    
    /**
     * Get the first character in the argument string
     * @param testString : String of interest
     * @return The first character in the argument
     */
    public static String getFirstChar(String testString)
    {
        String firstChar = testString.substring(0, 1);
        return firstChar;
    }
    
    /**
     * Returns the number of vowels in the string
     * Use numbers in one test value
     * Use empty string
     * mix cases
     * @param testString
     * @return 
     */
    public static int getVowelCount(String testString, boolean trackLowerCase)
    {
        int vowelCount = 0;
        
        char[] sa = testString.toCharArray();
        for (char c : sa)
        {
            if (Character.isLetter(c))
            {
                if (trackLowerCase)
                {
                    if (Character.isLowerCase(c))
                    {
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        {
                            vowelCount++;
                        }
                    }
                }
                else
                {
                    if (c == 'a' || c == 'A' ||
                        c == 'e' || c == 'E' ||
                        c == 'i' || c == 'I' ||
                        c == 'o' || c == 'O' ||
                        c == 'u' || c == 'U')
                    {
                        vowelCount++;
                    }
                }
            }
        }
        return vowelCount;
    }
    
    
    public static int getNumeralCount(String testString)
    {
        int numeralCount = 0;
        
        char[] sa = testString.toCharArray();
        for (char c : sa)
        {
            if (Character.isDigit(c))
            {
                numeralCount++;
            }
        }
        return numeralCount;
    }
    
    
    public static int[] doubleIntArray(int[] odds){
        int[] localArray = new int[]{};
        int count=0;
        
        for (int i : odds){
            localArray = Arrays.copyOf (localArray,localArray.length+1);
            localArray[count] = 2*odds[count];
            count++;
        }
            
                
        return localArray;
    }
            
}
