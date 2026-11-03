package de.hsd.inflab.parkinggarage.parking.gate.iface;

import de.hsd.inflab.parkinggarage.models.Receipt;
import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;

import java.time.LocalDateTime;

///
import de.hsd.inflab.parkinggarage.models.vehicles.VehicleTypes;
///

public interface Exit {
    public Receipt processOutgoing(LocalDateTime arrivalTime, LocalDateTime exitTime, VehicleTypes type);
}
