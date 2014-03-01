/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster;

import cput.codez.angorora.eventster.config.AllConfig;
import cput.codez.angorora.eventster.lsp.lspCorrection.model.ContractEmpl;
import cput.codez.angorora.eventster.lsp.lspCorrection.model.PermanentEmply;
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
public class lspCorrectionTest {
    static  ApplicationContext ctx;
    static  ContractEmpl contEmp;
    static PermanentEmply permEmp;
    double hoursWorked;
    double hrlyRate;
    double taxRate;
    double allowance;
    double baseSal;
    
    public lspCorrectionTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void contractPayTest() {
        hrlyRate=10;
        hoursWorked=8;
        Assert.assertEquals(contEmp.calculatePay(hoursWorked, hrlyRate), 80, .001, "was calculated");
    }
    @Test
    public void taxTest(){
        hrlyRate=10;
        hoursWorked=8;
        taxRate=2;
        Assert.assertEquals(contEmp.calculateTax(contEmp.calculatePay(hoursWorked, hrlyRate), taxRate), 1.6, 0.01);
    }
    public void permanentPaytest(){
        baseSal =10000;
        allowance =280;
        Assert.assertEquals(permEmp.calculateMonthlySalary(allowance, baseSal), 10280, 0.01,"was received");
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AllConfig.class);
        System.out.println("This test is meant to test two classes ContractEmpl and PermanentEmply which comply with LSP");
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        contEmp=(ContractEmpl) ctx.getBean("lspcontSal");
        permEmp=(PermanentEmply) ctx.getBean("lsppermSal");
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}