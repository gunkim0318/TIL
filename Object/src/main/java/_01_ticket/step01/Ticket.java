package _01_ticket.step01;

public class Ticket {
    private Long fee;

    public Ticket(Long fee) {
        this.fee = fee;
    }

    public Long getFee() {
        return this.fee;
    }
}