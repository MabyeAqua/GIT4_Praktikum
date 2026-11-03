package de.hsd.inflab.parkinggarage.parking.gate.impl;

import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.VehicleTypes;
import de.hsd.inflab.parkinggarage.parking.gate.iface.Entrance;

import java.time.LocalDateTime;

public class EntranceGateNew implements Entrance {
    
    public Ticket processIncoming(boolean full, double occupancy, VehicleTypes type){
        if(full){
            return Ticket.denyEntry("Parkhaus ist voll");
        }
        else if((type == VehicleTypes.SEMI && occupancy >= 0.8)){
            return Ticket.denyEntry("Parkhaus ist zu voll für Lastkraftwagen");
        }
        return Ticket.issue(LocalDateTime.now());
    }


}