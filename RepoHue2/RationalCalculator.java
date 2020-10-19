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
public class RationalCalculator extends AbstractCalculator{

    public RationalCalculator(Number.CalculationOperation add, Number.CalculationOperation sub, Number.CalculationOperation multi, Number.CalculationOperation div) {
        super(add, sub, multi, div);
    }

    @Override
    public Number add(Number a, Number b) {
        Number n = new Number();
    }

    @Override
    public Number sub(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number multi(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number div(Number a, Number b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
