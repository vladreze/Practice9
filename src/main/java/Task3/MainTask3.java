package Task3;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainTask3 {
    public static void main(String[] args) {
        List<Ticket> ticketList = new ArrayList<>();

        ticketList.add(new Ticket(8, LocalDate.now()));
        ticketList.add(new Ticket(5, LocalDate.now()));
        ticketList.add(new Ticket(1, LocalDate.now()));



//        ticketList.stream().sorted(Comparator.comparing(Ticket::getPriority)).forEach(System.out::println);






    }
}
