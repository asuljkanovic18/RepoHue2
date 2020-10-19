/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hue2.RepoHue2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author anels
 */
public class Main {
        
    public static void main(String[] args) throws IOException {
            Scanner s = new Scanner(System.in);
            System.out.println("Choose a number");
            System.out.println("1 ... NumberTester");
            System.out.println("2 ... Calculators");
            
            int number;
            number = Integer.parseInt(s.next());
            switch(number){
                case 1: NumberTester ntester = new NumberTester("LukaDoncic.txt");
                        ntester.testFile();
                        break;
                case 2: 
            }
        }
    public void calculators(){
            
    }
}
