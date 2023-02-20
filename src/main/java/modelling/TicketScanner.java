package modelling;

import java.util.ArrayList;

public class TicketScanner {
    private ArrayList<Ticket> tickets = new ArrayList<>();

    public boolean isValid(Ticket ticket) {
        return false;
    }

    public void deleleTicket(Ticket ticket) {

    }

    public ArrayList<Ticket> getTickets() {
        return null;
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    @Override
    public String toString() {
        return "TicketScanner{" +
                "tickets=" + tickets +
                '}';
    }
}
