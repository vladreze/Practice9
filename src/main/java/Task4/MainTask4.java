package Task4;

public class MainTask4 {
    public static void main(String[] args) {

        CheckoutRequest checkoutRequest = CheckoutRequest.builder().id(2).request("Good request").build();

        System.out.println(checkoutRequest);
    }
}
