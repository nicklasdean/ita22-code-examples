package modelling;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Owner benjamin = new Owner("Benjamin Hughes", 23, "kjasdksdbk");
        Ticket benjaminsTicket = new Ticket(benjamin, "Værløse", "Vesterbro", new Date(20/3/2023), new Date(21/3/2023));
        TicketScanner ticketScanner = new TicketScanner();
        ticketScanner.addTicket(benjaminsTicket);
        System.out.println(ticketScanner);
    }
}
