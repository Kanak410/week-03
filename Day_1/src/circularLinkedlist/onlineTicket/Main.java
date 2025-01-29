package circularLinkedlist.onlineTicket;

public class Main {
    public static void main (String[]args){
        TicketReservation system = new TicketReservation();

        system.addTicket(1, "Ali", "Movie A", "A1", "10:00 AM");
        system.addTicket(2, "Bali", "Movie B", "B1", "11:00 AM");
        system.addTicket(3, "Chaya", "Movie A", "A2", "10:30 AM");

        system.displayTickets();

        system.searchTicket("Ali", null);
        system.countTickets();

        system.removeTicket(2);
        system.displayTickets();
    }
}
