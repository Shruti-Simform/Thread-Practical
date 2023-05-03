public class BookTheaterSeat {
    static int total_seats = 20;

    synchronized static void bookSeat(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " seats are booked.");
            total_seats -= seats;
            System.out.println("Seats left : " + total_seats);
        } else {
            System.out.println(seats + " seats can not be booked...!!");
            System.out.println("Seats left : " + total_seats);
        }
    }
}
