package File类IO流07.File类01.递归技术03.chatgpt;

import java.io.File;

public class CreateDirectories {
    public static void createDirectories(int n, int m) {
        for (int i = 1; i <= n; i++) {
            // 创建第一层文件夹
            File dir = new File(String.format("E:\\临时存放点", i));
            dir.mkdir();

            // 在每个文件夹中创建深度为m的子文件夹
            createSubDirectories(dir, n, m - 1);
        }
    }

    private static void createSubDirectories(File parentDir, int n, int m) {
        if (m == 0) {
            return;
        }

        for (int i = 1; i <= n; i++) {
            File dir = new File(parentDir, String.format("E:\\临时存放点", i));
            dir.mkdir();
            createSubDirectories(dir, n, m - 1);
        }
    }

    public static void main(String[] args) {
        createDirectories(2,2);
    }
}