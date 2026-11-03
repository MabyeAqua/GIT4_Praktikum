package de.hsd.inflab.parkinggarage.models.ticket;

import java.time.LocalDateTime;

public class ValidTicket extends Ticket {   /// Mit dem Schlüsselwort extends erbt die Klasse ValidTicket von der Klasse Ticket.
    ValidTicket(LocalDateTime timeStamp){   /// Es werden alle Variablen und Methoden der Oberklasse vererbt, sowie abstrakte Methoden 
        this.timeStamp = timeStamp;         /// überschrieben.
    }

    @Override
    public boolean isValid() {              /// Polymorphie. Die Methode isValid wird von der Oberklasse überschrieben.
        return true;
    }
}
