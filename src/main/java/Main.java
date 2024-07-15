import static java.lang.Math.toIntExact;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        int price = 10_000;
        boolean registered = true; // или false
        int miles = toIntExact(service.calculate(price, registered));
        System.out.println(miles);
    }
}
