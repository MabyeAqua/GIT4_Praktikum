package de.hsd.inflab.parkinggarage.models.ticket;

import java.time.LocalDateTime;

public abstract class Ticket {          /// Ticket ist eine abstrakte Klasse und kann nicht direkt instanziiert werden, beschreibt aber wie die klasse auszusehen hat

    protected LocalDateTime timeStamp;  /// Kapselung. Die Variablen timeStamp und reason sind mit dem Schlüsselwort protected geschütz und können nur von Klassen die
    protected String reason;            /// erben benutzt werden. Um von auserhalb kontrolliert darauf zuzugreifen, werden die get und set Methoden benutzt.

    public static Ticket issue(LocalDateTime timeStamp) {
        return new ValidTicket(timeStamp);
    }

    public static Ticket denyEntry(String reason) {
        return new NoEntryTicket(reason);
    }

    public abstract boolean isValid();

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
    public String getReason() {
        return reason;
    }
}
