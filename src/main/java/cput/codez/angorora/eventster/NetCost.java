/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster;

/**
 *
 * @author allen
 */
public class NetCost {
       
    double netVenueCost(double venueCost, double tax) {
        return (venueCost-(venueCost*tax/100));
    }
    double netFoodCost(double foodCosts, double tax) {
          return (foodCosts-(foodCosts*tax/100));
    }
}
