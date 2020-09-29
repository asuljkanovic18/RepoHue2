/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2.RepoHue2;

/**
 *
 * @author anels
 */
public class NumberTester {
    public interface NumberTest {
        boolean testNumber(int number);
    }
    private String fileName;
    private NumberTester oddTester;
    private NumberTester primeTester;
    private NumberTester palindromeTester;
    
    
    public NumberTester(String fleName){
        this.fileName = fileName;
    }
    
    public void setOddEvenTester(NumberTester oddTester){
        this.oddTester = oddTester;
   }
    
    public void setPrimeTester(NumberTester primeTester){
        this.primeTester = primeTester;
    }
    
    public void setPalindromeTester(NumberTester palindromeTester){
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile(){
        
    }
    
    
}
