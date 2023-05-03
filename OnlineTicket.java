public class OnlineTicket extends Thread {
    BookTheaterSeat bts;
    int seats;

    public OnlineTicket(BookTheaterSeat bts, int seats) {
        this.bts = bts;
        this.seats = seats;
    }

    @Override
    public void run() {
        bts.bookSeat(seats);
    }
}
