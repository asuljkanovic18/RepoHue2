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
public class Number{
    private double a;
    private double b;

    public Number() {
    }

    public Number(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public interface CalculationOperation{
        Number calc(Number x, Number y);
    }

    @Override
    public String toString() {
        return "Number{" + "a=" + a + ", b=" + b + '}';
    }
    
    
}

