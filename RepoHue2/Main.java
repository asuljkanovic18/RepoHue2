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
                    calculators();
            }
        }
    
    public static void calculators(){
        Scanner sca = new Scanner(System.in);
        System.out.println("Choose Calculator");
        System.out.println("1..RationalCalculator");
        System.out.println("2..VectorCalculator");
        System.out.println("3..ComplexCalculator");
        System.out.println("4..Exit program");
        
        int input;
        input = Integer.parseInt(sca.next());
        if(input == 4){
            return;
        }
        System.out.println("Enter number x a> ");
            int ax = Integer.parseInt(sca.next());
            System.out.println("Enter number y a> ");
            int ay = Integer.parseInt(sca.next());
            System.out.println("Enter number x b> ");
            int bx = Integer.parseInt(sca.next());
            System.out.println("Enter number y b> ");
            int by = Integer.parseInt(sca.next());
            Number a = new Number(ax, bx);
            Number b = new Number(ay, by);
            
            
        
        while(input!=4){
            
            AbstractCalculator calcul = null;
            
            
            switch(input){
                case 1:
                    calcul = new RationalCalculator(
                            (pA, pB) -> new Number(pA.getA() + pB.getA(), pA.getB() + pB.getB()),
                            (pA, pB) -> new Number(pA.getA() - pB.getA(), pA.getB() - pB.getB()),
                            (pA, pB) -> new Number(pA.getA() * pB.getA(), pA.getB() * pB.getB()),
                            (pA, pB) -> new Number(pA.getA() + pB.getB(), pA.getB() + pB.getA()));
                    break;
                case 2: 
                            calcul = new VektorCalculator(
                            (pA, pB) -> new Number(pA.getA() + pB.getA(), pA.getB() + pB.getB()),
                            (pA, pB) -> new Number(pA.getA() - pB.getA(), pA.getB() - pB.getB()),
                            (pA, pB) -> new Number(pA.getA() * pB.getB(), pB.getA() + pA.getB()),
                            (pA, pB) -> new Number(pA.getA() * pA.getB(), pB.getA() * pB.getB())
                    );
                    break;
                case 3:
                    calcul = new ComplexcCalculator(
                            (pA, pB) -> new Number(pA.getA() + pB.getA(), pA.getB() + pB.getB()),
                            (pA, pB) -> new Number(pA.getA() - pB.getA(), pB.getB() - pA.getB()),
                            (pA, pB) -> new Number(pA.getA() * pB.getB(), pB.getA() * pA.getB()),
                            (pA, pB) -> new Number(pA.getA() * pA.getB(), pB.getA() * pB.getB())
                    );
                    break;
                default:
                    System.out.println("Calculator doesn't exitst");
                    return;
            }
            
            System.out.println("Choose Operation");
            System.out.println("1..add");
            System.out.println("2..sub");
            System.out.println("3..multi");
            System.out.println("4..div");
            System.out.println("Exit");
            
            int operation = Integer.parseInt(sca.next());
            Number erg;
            switch(operation){
                case 1:
                    erg = calcul.add.calc(a, b);
                    System.out.println("Solution a: "+erg.getA());
                    System.out.println("Solution b: "+erg.getB());
                    break;
                case 2:
                    erg = calcul.sub.calc(a, b);
                    System.out.println("Solution a: "+erg.getA());
                    System.out.println("Solution b: "+erg.getB());
                    break;
                case 3:
                    erg = calcul.multi.calc(a, b);
                    System.out.println("Solution a: "+erg.getA());
                    System.out.println("Solution b: "+erg.getB());
                    break;
                case 4:
                    erg = calcul.div.calc(a, b);
                    System.out.println("Solution a: "+erg.getA());
                    System.out.println("Solution b: "+erg.getB());
                    break;
                default:
                    System.out.println("Operation doesn't exist");
                    return;
            }
            
            
            
            
    }
}
}
