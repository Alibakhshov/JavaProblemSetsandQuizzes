import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Customer aktan = new Customer("Aktan");
        System.out.println(aktan);
        Date nah = new Date();
        Visit poh = new Visit(aktan, nah);
        System.out.println(poh);
    }
}
