import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float mathPoint, logicalPoint, chemistryPoint, literaturePoint, englishPoint, mediumPoint;
        System.out.println("Nhập điểm môn toán: ");
        mathPoint = sc.nextFloat();
        System.out.println("Nhập điểm môn lý: ");
        logicalPoint = sc.nextFloat();
        System.out.println("Nhập điểm môn hóa: ");
        chemistryPoint = sc.nextFloat();
        System.out.println("Nhập điểm môn văn: ");
        literaturePoint = sc.nextFloat();
        System.out.println("Nhập điểm môn tiếng Anh: ");
        englishPoint = sc.nextFloat();

        mediumPoint = (mathPoint + logicalPoint + chemistryPoint + literaturePoint + englishPoint)/5;
        if (mediumPoint < 5){
            System.out.println("Điểm trung bình của bạn " +mediumPoint + " xếp loại yếu");
        }else if (5<=mediumPoint && mediumPoint<6.5){
            System.out.println("Diểm trung bình của bạn " +mediumPoint+ " xếp loại trung bình");
        } else if (6.5<=mediumPoint && mediumPoint<8) {
            System.out.println("Điểm trung bình của bạn " +mediumPoint+ " xếp loại khá");
        } else if (8<=mediumPoint && mediumPoint<9) {
            System.out.println("Điểm trung bình của bạn " +mediumPoint+ " xếp loại giỏi");
        }else {
            System.out.println("Điểm trung bình của bạn " +mediumPoint+ " xếp loại xuất sắc");
        }
    }
}
