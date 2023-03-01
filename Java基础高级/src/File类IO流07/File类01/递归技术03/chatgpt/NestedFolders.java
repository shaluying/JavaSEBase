package File类IO流07.File类01.递归技术03.chatgpt;

import java.io.File;

public class NestedFolders {

    public static void createNestedFolders(int n, int m, String root) {
        File file = new File(root);
        file.mkdir();
        for (int i = 0; i < n; i++) {
            String folderName = root + "/folder" + i;
            File folder = new File(folderName);
            folder.mkdir();
            for (int j = 0; j < n; j++) {
                String fileName = folderName + "/file" + j;
                File nestedFile = new File(fileName);
                try {
                    nestedFile.createNewFile();
                } catch (Exception e) {
                    System.out.println("Error creating file: " + e);
                }
                if (m > 1) {
                    createNestedFolders(n, m - 1, folderName + "/subfolder");
                }
            }
        }
    }

    public static void main(String[] args) {
        createNestedFolders(3, 3, "root");
    }
}