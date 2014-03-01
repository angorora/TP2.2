/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author allen
 */
public class ocpViolationTest {
    
    public ocpViolationTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
  
    FoodCost fcost = new FoodCost();
    VenueCost vcost = new VenueCost();
    NetCost ncost = new NetCost();
    static double beverages,lunch,dessert;
    static double chairs,tables,stage;
   
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void foodSubtotalTest() {
        double beverages = 500, lunch = 1000, dessert = 200;
        Assert.assertEquals(fcost.totalFoodCosts(beverages, lunch, dessert), 1700, 0.01);
    }
    @Test
    public void upperLimitDiscountDetermination()
    {
        double thresholdAmnt=6000;
         beverages = 500; lunch = 6000; dessert = 200;
        double foodCosts = fcost.totalFoodCosts(beverages, lunch, dessert);
        Assert.assertEquals(fcost.determineDiscount(thresholdAmnt,foodCosts), 5, 0.01);
    }
    @Test
     public void middleLimitDiscountDetermination()
    {
        double thresholdAmnt=6000;
        beverages = 500; lunch = 3000; dessert = 1000;
        double foodCosts = fcost.totalFoodCosts(beverages, lunch, dessert);
        Assert.assertEquals(fcost.determineDiscount(thresholdAmnt,foodCosts), 2.5, 0.01);
    }
    @Test
       public void lowerLimitDiscountDetermination()
    {
        double thresholdAmnt=6000;
        beverages = 500; lunch = 3000; dessert = 200;
        double foodCosts = fcost.totalFoodCosts(beverages, lunch, dessert);
        Assert.assertEquals(fcost.determineDiscount(thresholdAmnt,foodCosts), 0, 0.01);
    }
    @Test
    public void foodDeductions()
    {
        double thresholdAmnt=6000;
        beverages = 500; lunch = 3000; dessert = 200;
        double foodCosts = fcost.totalFoodCosts(beverages, lunch, dessert);
        double tax =fcost.determineDiscount(thresholdAmnt, foodCosts);
        Assert.assertEquals(ncost.netFoodCost(foodCosts,tax),3700,0.01);
    }
    @Test
    public void venueSubtotalTest() {
        chairs = 250; tables = 500; stage = 600;
        Assert.assertEquals(vcost.totalVenueCost(chairs,tables,stage), 1350, 0.01);
    }
    @Test
    public void venueUpperLimitDiscountDetermination()
    {
        double thresholdAmnt=8000;
        chairs = 1000; tables = 6000; stage = 1000;
        double venueCost= vcost.totalVenueCost(chairs,tables,stage);
        Assert.assertEquals(vcost.determineDiscount(thresholdAmnt,venueCost), 2.5, 0.01);
    }
    @Test
     public void venueMiddleLimitDiscountDetermination()
    {
        double thresholdAmnt=8000;
        chairs = 2000; tables = 2000; stage = 2500;
        double venueCost= vcost.totalVenueCost(chairs,tables,stage);
        Assert.assertEquals(vcost.determineDiscount(thresholdAmnt,venueCost), 1, 0.01);
    }
    @Test
       public void venueLowerLimitDiscountDetermination()
    {
        double thresholdAmnt=8000;
        chairs = 250; tables = 500; stage = 600;
        double venueCost= vcost.totalVenueCost(chairs,tables,stage);
        Assert.assertEquals(vcost.determineDiscount(thresholdAmnt,venueCost), 0, 0.01);
    }
    @Test
     public void venueDeductions() {
        double thresholdAmnt=8000;
        chairs = 250; tables = 500; stage = 600;
        double venueCost= vcost.totalVenueCost(chairs,tables,stage);
        double tax =vcost.determineDiscount(thresholdAmnt, venueCost);
        Assert.assertEquals(ncost.netVenueCost(venueCost,tax), 1350, 0.01);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}