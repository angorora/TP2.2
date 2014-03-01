/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.polymorphism;

/**
 *
 * @author allen
 */
public class FoodVat implements Costing{

    public double taxCalculation(double foodCost, double vatRate) {
        return(foodCost* (vatRate/100));
    }
    
}
