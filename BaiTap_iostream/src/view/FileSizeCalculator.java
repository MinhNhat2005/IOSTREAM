package view;

import java.io.File;
import java.util.Scanner;

public class FileSizeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn tới file:");
        String filePath = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            long fileSize = file.length();
            System.out.println("Kích thước của file là: " + fileSize + " byte(s).");
        } else {
            System.out.println("File không tồn tại hoặc không phải là file.");
        }
        scanner.close();
    }
}
