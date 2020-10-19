/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2.RepoHue2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anels
 */
public class NumberTester {
    public interface NumberTest {
        boolean testNumber(int number);
    }
    private File fileName;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    
    
    public NumberTester(String fleName){
        fileName = new File(fleName);
    }
    
    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
   }
    
    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }
    
    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }
    
    public void testFile() throws FileNotFoundException, IOException{
        setOddEvenTester(x -> {return x%2==0;});
        setPrimeTester(p-> {
            if(!oddTester.testNumber(p)) return true;
            for (int i = 2; i < p+1; i++) {
                if(p%i==0){
                    return false;
                }
                }return true;}); 
            setPalindromeTester(pa -> {
            String left = String.valueOf(pa); 
            String right = new StringBuilder(left).reverse().toString();
            return left.equals(right);
            });
            try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            int row = Integer.parseInt(br.readLine());
            int now = 0;
            
            String s = br.readLine().trim();
            int[] numbers = new int[2];
            
            while(s != null && now < row){
                numbers[0] = Integer.parseInt(s.split(" ")[0]);
                numbers[1] = Integer.parseInt(s.split(" ")[1]);
                
                int active = numbers[0];
                int finish = numbers[1];
                String erg = "";
                switch(active){
                    case 1:
                        if(this.oddTester.testNumber(finish)==true){
                            erg += " EVEN";
                        }else{
                            erg += " ODD";}
                        break;
                    case 2:
                        if(this.primeTester.testNumber(finish)==true){
                            erg += " PRIME";
                        }else{
                            erg += " not PRIME";}
                        break;
                    case 3:
                        if(this.palindromeTester.testNumber(finish)==true){
                            erg += " PALINDROM";
                        }else{
                            erg += " not PALINDROM";}
                        break;
                    default: System.out.println("You put in a number out of index");
                        break;
                }
                System.out.println(erg);
                now++;
                try{
                  s = br.readLine().trim();  
                }catch(NullPointerException ignored){}
                
            }
            
            }catch(IOException e) {
            e.printStackTrace();
        }}
    
    
}
