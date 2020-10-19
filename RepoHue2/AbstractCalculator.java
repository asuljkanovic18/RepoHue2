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
public abstract class AbstractCalculator {
     protected Number.CalculationOperation add ;
        protected Number.CalculationOperation sub;
        protected Number.CalculationOperation multi;
        protected Number.CalculationOperation div;

        public AbstractCalculator(Number.CalculationOperation add, Number.CalculationOperation sub, Number.CalculationOperation multi, Number.CalculationOperation div) {
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

