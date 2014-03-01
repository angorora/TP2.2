/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster;

/**
 *
 * @author allen
 */
public class VenueCost {
      double totalVenueCost(double chairs, double tables, double stage) {
       return(chairs+tables+stage);
    }
       double determineDiscount(double thresholdAmnt, double venueCosts) {
        double tax;
       if(venueCosts>=thresholdAmnt) 
           tax=2.5;
       else
           if(venueCosts>=(0.75*thresholdAmnt))
               tax=1;
       else
               tax=0;
       return tax;
       }
}
