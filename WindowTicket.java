public class WindowTicket extends Thread {
    BookTheaterSeat bts;
    int seats;

    public WindowTicket(BookTheaterSeat bts, int seats) {
        this.bts = bts;
        this.seats = seats;
    }

    @Override
    public void run() {
        bts.bookSeat(seats);
    }
}
