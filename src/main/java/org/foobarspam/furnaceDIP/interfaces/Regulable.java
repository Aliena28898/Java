/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.foobarspam.furnaceDIP.interfaces;

import org.foobarspam.furnaceDIP.types.RegulatorDisplayCodes;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

/**
 *
 * @author Dual
 */
public interface Regulable {

    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature);

    public void message(RegulatorDisplayCodes code, RoomTemperature temperature);

}
