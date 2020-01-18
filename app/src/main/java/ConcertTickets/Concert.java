package ConcertTickets;

import java.util.Scanner;

public class Concert {

    public static void main(String[] args) {
        Venue kanyeWest = new Venue();
        kanyeWest.artistName = "Kanye West";
        kanyeWest.ticketPrice = 800;
        kanyeWest.date = "Monday, Jan 3rd 2019";
        kanyeWest.time = "10:30pm";
        kanyeWest.ticketsAvailable = 20;

        Venue christianGuzman = new Venue();
        christianGuzman.artistName = "Christian Guzman";
        christianGuzman.ticketPrice = 1200;
        christianGuzman.date = "Tuesday, Jan 9rd 2019";
        christianGuzman.time = "10:35pm";
        christianGuzman.ticketsAvailable = 5;

        Venue jCole = new Venue();
        jCole.artistName = "J-Cole";
        jCole.ticketPrice = 700;
        jCole.date = "Thursday, Jan 12rd 2019";
        jCole.time = "10:40pm";
        jCole.ticketsAvailable = 25;

        Scanner print = new Scanner(System.in);
        System.out.print("Name: ");
        String name = print.nextLine();
        print.close();

        System.out.println("Artists: [1]Kanye West, [2]Christian Guzman, [3]J-Cole");
        Scanner printArtist = new Scanner(System.in);
        System.out.print("Who do you want to see (Choose a #)?: ");
        String whichArtist = printArtist.nextLine().strip();
        printArtist.close();

        if (whichArtist.equals("1")) {
            System.out.println(kanyeWest.buyTicket());

            for (int tickets = 0; tickets < kanyeWest.ticketsBought; tickets++) {
                System.out.println(name + kanyeWest.getMenu());
            }

        } else if (whichArtist == "2") {
            System.out.println(jCole.buyTicket());

            for (int tickets = 0; tickets < jCole.ticketsBought; tickets++) {
                System.out.println(name + jCole.getMenu());
            }

        } else if (whichArtist == "3") {
            System.out.println(christianGuzman.buyTicket());

            for (int tickets = 0; tickets < christianGuzman.ticketsBought; tickets++) {
                System.out.println(name + christianGuzman.getMenu());
            }

        } else {
            System.out.println("not an artist try again lol.");
        }
        print.close();
    }
}