package ConcertTickets;

import java.util.Scanner;

public class Venue {
    String artistName;
    int ticketPrice;
    String date;
    String time;
    int ticketsAvailable;
    int ticketsBought;

    public String getMenu() {
        return ("Artist Name: " + artistName + "\n" + "Date and Time: " + date + " " + time);

    }

    public String buyTicket() {
        Scanner howManyTickets = new Scanner(System.in);
        System.out.print("How many Tickets: ");
        ticketsBought = howManyTickets.nextInt();
        howManyTickets.close();
        ticketsAvailable = ticketsAvailable - ticketsBought;

        return ("You bought " + ticketsBought + " tickets");
    }
}