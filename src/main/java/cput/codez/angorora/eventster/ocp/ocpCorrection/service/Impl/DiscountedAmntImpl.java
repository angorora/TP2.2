/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cput.codez.angorora.eventster.ocp.ocpCorrection.service.Impl;

import cput.codez.angorora.eventster.ocp.ocpCorrection.model.DiscountedAmnt;

/**
 *
 * @author allen
 */
public class DiscountedAmntImpl implements DiscountedAmnt{

    public double netAmnt(double totAmnt, double discount) {
        return (totAmnt-(totAmnt*discount/100));
    }
}
