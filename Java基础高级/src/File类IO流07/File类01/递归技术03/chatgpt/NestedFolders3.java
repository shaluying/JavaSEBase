package File类IO流07.File类01.递归技术03.chatgpt;

import java.io.File;

public class NestedFolders3 {

    // createNestedFolders 函数用于创建嵌套的文件夹，接受三个参数：n，m 和 root
    public static void createNestedFolders(int n, int m, String root) {
        // 创建一个文件对象，代表根文件夹
        File file = new File(root);
        // 创建根文件夹
        file.mkdir();
        // 循环 n 次，创建 n 个文件夹
        for (int i = 0; i < n; i++) {
            // 创建文件夹名称，为 root 加上 "/folder" + i
            String folderName = root + "/folder" + i;
            // 创建文件夹对象
            File folder = new File(folderName);
            // 创建文件夹
            folder.mkdir();
            // 循环 n 次，在文件夹中创建 n 个文件
            for (int j = 0; j < n; j++) {
                // 创建文件名称，为 folderName 加上 "/file" + j
                String fileName = folderName + "/file" + j;
                // 创建文件对象
                File nestedFile = new File(fileName);
                // 尝试创建文件
                try {
                    nestedFile.createNewFile();
                } catch (Exception e) {
                    System.out.println("Error creating file: " + e);
                }
                // 如果 m 大于 1，递归调用 createNestedFolders，
                // 传入的参数为 n，m - 1 和 folderName + "/subfolder"
                if (m > 1) {
                    createNestedFolders(n, m - 1, folderName + "/subfolder");
                }
            }
        }
    }

    public static void main(String[] args) {
        // 调用 createNestedFolders，参数为 3，3，"root"
        createNestedFolders(3, 3, "E:\\");
    }
}