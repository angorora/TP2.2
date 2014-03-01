/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster;

/**
 *
 * @author allen
 */
public class FoodCost {
     double totalFoodCosts(double beverages, double lunch, double dessert) {
        return(beverages+lunch+dessert);
    }

    double determineDiscount(double thresholdAmnt, double foodCosts) {
        double tax;
       if(foodCosts>=thresholdAmnt) 
           tax=5;
       else
           if(foodCosts>=(0.75*thresholdAmnt))
               tax=2.5;
       else
               tax=0;
       return tax;
    }
}
