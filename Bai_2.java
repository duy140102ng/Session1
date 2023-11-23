import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int RATE  = 23000;
        System.out.println("Mời bạn nhập giá trị USD: ");
        float usd = sc.nextFloat();
        int vnd = (int) (usd * RATE);
        System.out.printf("%.1fUSD đổi sang VND là: " +vnd, usd);
    }
}
