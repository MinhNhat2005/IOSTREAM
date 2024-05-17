package view;
import java.io.File;
import java.util.Scanner;

public class FileDeleter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn tới thư mục hoặc file:");
        String path = scanner.nextLine();

        File file = new File(path);
        if (file.exists()) {
            deleteFileOrDirectory(file);
        } else {
            System.out.println("Thư mục hoặc file không tồn tại.");
        }
        scanner.close();
    }

    private static void deleteFileOrDirectory(File file) {
        if (file.isDirectory()) {
            // Xóa tất cả các tập tin và thư mục con
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    deleteFileOrDirectory(f);
                }
            }
        }
        // Xóa file hoặc thư mục
        if (file.delete()) {
            System.out.println("Xóa thành công: " + file.getAbsolutePath());
        } else {
            System.out.println("Xóa thất bại: " + file.getAbsolutePath());
        }
    }
}
