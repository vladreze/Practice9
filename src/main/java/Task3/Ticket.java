package Task3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;

public class Ticket {
    private int priority;
    private LocalDate localDate;

    public Ticket(int priority, LocalDate localDate) {
        this.priority = priority;
        this.localDate = localDate;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public static class TicketComparitor{
        public static final Comparator<Ticket> BY_PRIORITY = Comparator.comparingInt(Ticket::getPriority);
        public static final Comparator<Ticket> BY_CREATED_AT = Comparator.comparing(Ticket::getLocalDate);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "priority=" + priority +
                ", localDate=" + localDate +
                '}';
    }
}
