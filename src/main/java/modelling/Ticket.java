package modelling;

import java.util.Date;

public class Ticket {
    private Owner owner;
    private String toStation;
    private String fromStation;
    private Date startDate;
    private Date finishDate;

    public Ticket(Owner owner, String toStation, String fromStation, Date startDate, Date finishDate) {
        this.owner = owner;
        this.toStation = toStation;
        this.fromStation = fromStation;
        this.startDate = startDate;
        this.finishDate = finishDate;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "owner=" + owner +
                ", toStation='" + toStation + '\'' +
                ", fromStation='" + fromStation + '\'' +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                '}';
    }
}
