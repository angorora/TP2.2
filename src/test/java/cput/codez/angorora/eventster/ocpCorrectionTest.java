/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster;

import cput.codez.angorora.eventster.ocp.ocpCorrection.model.DiscountedAmnt;
import cput.codez.angorora.eventster.config.AllConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
public class ocpCorrectionTest {
    
    public ocpCorrectionTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    static  DiscountedAmnt disc;
    FoodCost fcost = new FoodCost();
    VenueCost vcost = new VenueCost();
    static double beverages,lunch,dessert;
    static double chairs,tables,stage;
  
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext  ctx = new AnnotationConfigApplicationContext(AllConfig.class);
        disc= (DiscountedAmnt)ctx.getBean("discount");
    }
    @Test
    public void foodDeductions()
    {
        double thresholdAmnt=6000;
        beverages = 500; lunch = 3000; dessert = 200;
        double foodCosts = fcost.totalFoodCosts(beverages, lunch, dessert);
        double tax =fcost.determineDiscount(thresholdAmnt, foodCosts);
        Assert.assertEquals(disc.netAmnt(foodCosts,tax),3700,0.01);
    }
    @Test
    public void venueDeductions() {
        double thresholdAmnt=8000;
        chairs = 250; tables = 500; stage = 600;
        double venueCost= vcost.totalVenueCost(chairs,tables,stage);
        double tax =vcost.determineDiscount(thresholdAmnt, venueCost);
        Assert.assertEquals(disc.netAmnt(venueCost, tax), 1350, 0.01);
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