import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số cần kiểm tra: ");
        int number = sc.nextInt();

        String check = (number % 3 == 0 && number % 5 == 0) ? "Chia hết cho cả 3 và 5" :
                (number % 3 == 0 && number % 5 != 0) ? "Chỉ chia hết cho 3" :
                        (number % 3 != 0 && number % 5 == 0) ? "Chỉ chia hết cho 5" : "Không chia hết cho 3, cũng không chia hết cho 5";
        System.out.println(check);
    }
}
