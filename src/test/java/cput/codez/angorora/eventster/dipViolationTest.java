/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster;

import cput.codez.angorora.eventster.dip.violation.model.ConferenceEvent;
import cput.codez.angorora.eventster.dip.violation.model.SportingEvent;
import cput.codez.angorora.eventster.dip.violation.service.Impl.EventNotifier;
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
public class dipViolationTest {
    ConferenceEvent cevent;
    SportingEvent sevent;
    EventNotifier notif=new EventNotifier();
    public dipViolationTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testSport() {
        sevent =new SportingEvent();
        
        Assert.assertNotNull(notif.sendSportingNote(sevent));
    }
    @Test
    public void testConf(){
        cevent = new ConferenceEvent();
        Assert.assertNotNull(notif.sendConferenceNote(cevent));
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("\nThis Test is for violation of DIP\n the higher level class is dependent on the detail of lower level classes\n\n");
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