package Task2;

public class MainTask2 {
    public static void main(String[] args) {
          TicketService ticketService = new TicketService();

          String ticket = ticketService.buildTicketId("Kyiv - Lviv");
          System.out.println(ticket);
    }
}
