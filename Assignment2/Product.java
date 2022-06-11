import java.util.Formatter;  
public class Product{
    public static void main(String[] args) {
        int productNo = 3;
        String productName = "Vaseline";
        Double price = 40.39;
        int quantity = 10;
        double TotalAmount = quantity * price;
        System.out.printf("%10s %15s %10s %10s %15s\n", "productNo","productName","quantity","price","TotalAmount");
        System.out.printf("%10d %15s %10d %10f %15f\n", productNo,productName,quantity,price,TotalAmount);
    }
}



