package de.hsd.inflab.parkinggarage.parking.gate.iface;

import de.hsd.inflab.parkinggarage.models.ticket.Ticket;
import de.hsd.inflab.parkinggarage.models.vehicles.Vehicle;
import de.hsd.inflab.parkinggarage.models.vehicles.VehicleTypes;

import java.time.LocalDateTime;

public interface Entrance {
    public Ticket processIncoming(boolean full, double occupancy, VehicleTypes type);
}


/// Entrance ist ein Interface. Es beschreibt wie eine Klasse auszusehen hat und welche Methoden implimentiert werden müssen.
/// Mit dem Interface können unterschiedliche Einfahrtklassen über den Typ Entrance erstellt werden.
/// Theoretisch wäre es auch mit einer normalen Vererbung (abstrakte Oberklasse) möglich.
/// Eine gemeinsame Oberklasse wäre ehr schwierig da Ein- und Ausfahrt verschiedene Methoden mit verschiedenen Parametern benötigen.