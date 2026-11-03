package de.hsd.inflab.parkinggarage.parking.gate.impl;

import de.hsd.inflab.parkinggarage.models.Receipt;
import de.hsd.inflab.parkinggarage.models.vehicles.VehicleTypes;
import de.hsd.inflab.parkinggarage.parking.gate.iface.Exit;

import java.time.Duration;
///
import java.time.LocalDateTime;
///

public class ExitGateNew implements Exit {
    public Receipt processOutgoing(LocalDateTime arrivalTime, LocalDateTime exitTime, VehicleTypes type) {
        long minuten = Duration.between(arrivalTime, exitTime).toMinutes();
        long stunden = Duration.between(arrivalTime, exitTime).toHours();
        int amount = 0;
        if(minuten <= 15){
           return new Receipt(amount, Duration.ofMinutes(minuten), type); 
        }
        else if(type == VehicleTypes.SEMI){
        amount = ((int)stunden+1)*2+5;
        return new Receipt(amount, Duration.ofMinutes(minuten), type);
        }
        else if(type == VehicleTypes.MOTORCYCLE){
            amount = ((int)stunden+1)*2-1;
            return new Receipt(amount, Duration.ofMinutes(minuten), type);
        }
        amount = ((int)stunden+1)*2;
        return new Receipt(amount, Duration.ofMinutes(minuten), type);
    }
}
