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
public class Number {
    private double a;
    private double b;

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
    
    public abstract class AbstractCalculator{
        protected CalculationOperation add ;
        protected CalculationOperation sub;
        protected CalculationOperation multi;
        protected CalculationOperation div;

        public AbstractCalculator(CalculationOperation add, CalculationOperation sub, CalculationOperation multi, CalculationOperation div) {
            this.add = add;
            this.sub = sub;
            this.multi = multi;
            this.div = div;
        }
        
        public abstract Number add(Number a, Number b);
        public abstract Number sub(Number a, Number b);
        public abstract Number multi(Number a, Number b);
        public abstract Number div(Number a, Number b);
    }
}
