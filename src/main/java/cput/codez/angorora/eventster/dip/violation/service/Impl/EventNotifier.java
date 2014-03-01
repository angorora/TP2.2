/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.dip.violation.service.Impl;

import cput.codez.angorora.eventster.dip.violation.model.ConferenceEvent;
import cput.codez.angorora.eventster.dip.violation.model.SportingEvent;

/**
 *
 * @author allen
 */
public class EventNotifier {
    
    public String sendConferenceNote(ConferenceEvent conev){
        return (conev.notification());
    }
    public  String  sendSportingNote(SportingEvent spo){
        return(spo.notification());
    }
}
