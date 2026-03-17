package Task4;

import lombok.Builder;

@Builder
public class CheckoutRequest {
    private int id;
    private String request;

    @Override
    public String toString() {
        return "CheckoutRequest{" +
                "id=" + id +
                ", request='" + request + '\'' +
                '}';
    }
}
