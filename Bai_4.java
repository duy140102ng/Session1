import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length, width, perimeter, acreage;
        System.out.println("Nhập chiều dài: ");
        length = sc.nextFloat();
        System.out.println("Nhập chiều rộng: ");
        width = sc.nextFloat();
        perimeter = (length+width)*2;
        acreage = length*width;
        System.out.println("Chu vi hình chữ nhật là: " +perimeter);
        System.out.println("Diện tích hình chữ nhật là: " +acreage);
    }
}
