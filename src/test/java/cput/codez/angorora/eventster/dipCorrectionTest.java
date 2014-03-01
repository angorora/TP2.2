/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster;

import cput.codez.angorora.eventster.config.AllConfig;
import cput.codez.angorora.eventster.dip.correction.model.Notication;
import cput.codez.angorora.eventster.dip.correction.service.Impl.ConferensEvent;
import cput.codez.angorora.eventster.dip.correction.service.Impl.NoticationImpl;
import cput.codez.angorora.eventster.dip.correction.service.Impl.SportEvent;
import cput.codez.angorora.eventster.dip.violation.model.ConferenceEvent;
import java.util.ArrayList;
import java.util.List;
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
public class dipCorrectionTest {
    static ApplicationContext ctx;
    static  NoticationImpl notif;
    static SportEvent sevent;
    static ConferensEvent cevent;
    static  List<Notication> eventlist = new ArrayList<Notication>();
    public dipCorrectionTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testSport() {
         sevent = new SportEvent();
         eventlist.add(sevent);
         Assert.assertNotNull(notif.eventNote(sevent));
     }
     @Test
     public void testConference(){
         cevent= new ConferensEvent();
         eventlist.add(cevent);
         Assert.assertNotNull(notif.eventNote(cevent));
     }      
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AllConfig.class);
        notif = (NoticationImpl) ctx.getBean("superNote");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        for(Notication n:eventlist)
            System.out.println(notif.eventNote(n));
    }
}