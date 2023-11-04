
public class FaturaTeste {
    
 public static void main(String[] args) {
        Fatura fatura1 = new Fatura("123", "Teclado", 2, 29.99);
        Fatura fatura2 = new Fatura("456", "Mouse", -1, -15.0);

        System.out.println("Fatura 1 - Total: $" + fatura1.getTotalFatura());
        System.out.println("Fatura 2 - Total: $" + fatura2.getTotalFatura());

        fatura1 = new Fatura("789", "Monitor", 5, 199.99);
        fatura2 = new Fatura("101", "Fones de ouvido", 3, -25.0);

        System.out.println("Fatura 1 - Total: $" + fatura1.getTotalFatura());
        System.out.println("Fatura 2 - Total: $" + fatura2.getTotalFatura());
    }
}
