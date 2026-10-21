import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Nhập họ và tên của bạn: ");
        String hoTen = scanner.nextLine();

        // In ra màn hình
        System.out.println("Xin chào: " + hoTen);

        scanner.close();
    }
}