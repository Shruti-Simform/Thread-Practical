public class MovieBookApp extends BookTheaterSeat {
    public static void main(String[] args) {
        BookTheaterSeat b1 = new BookTheaterSeat();
        OnlineTicket user1 = new OnlineTicket(b1, 7);
        user1.start();
        OnlineTicket user2 = new OnlineTicket(b1, 6);
        user2.start();

        BookTheaterSeat b2 = new BookTheaterSeat();
        WindowTicket user3 = new WindowTicket(b2, 9);
        user3.start();
        WindowTicket user4 = new WindowTicket(b2, 5);
        user4.start();
    }
}
