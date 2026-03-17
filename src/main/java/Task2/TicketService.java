package Task2;

public class TicketService {

    public String buildTicketId(String base){

        class IdBuilder{
            String prefix = "Ticket";
            String build(){
                return prefix + " | " + base + " | " + System.currentTimeMillis() + ".txt";
            }
        }

        IdBuilder idBuilder = new IdBuilder();
        return idBuilder.build();


    }

    public Runnable runOnce(){

        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        };

    }
}
