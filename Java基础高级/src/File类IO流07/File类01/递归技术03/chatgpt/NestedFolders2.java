package File类IO流07.File类01.递归技术03.chatgpt;

import java.io.File;

public class NestedFolders2 {

    // createNestedFolders is the main function that takes 3 arguments: n, m, root
    public static void createNestedFolders(int n, int m, String root) {
        // Create a File object for the root folder
        File file = new File(root);
        // Create the root folder
        file.mkdir();

        // Loop n times to create n folders
        for (int i = 0; i < n; i++) {
            // Create a folderName by combining root and "folder" + i
            String folderName = root + "/folder" + i;
            // Create a File object for the folder
            File folder = new File(folderName);
            // Create the folder
            folder.mkdir();

            // Loop n times to create n files inside the folder
            for (int j = 0; j < n; j++) {
                // Create a fileName by combining folderName and "file" + j
                String fileName = folderName + "/file" + j;
                // Create a File object for the file
                File nestedFile = new File(fileName);
                // Try to create the file
                try {
                    nestedFile.createNewFile();
                } catch (Exception e) {
                    System.out.println("Error creating file: " + e);
                }
                // If m is greater than 1, recursively call createNestedFolders
                // with m - 1, n, and folderName + "/subfolder"
                if (m > 1) {
                    createNestedFolders(n, m - 1, folderName + "/subfolder");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Call createNestedFolders with 3, 3, "root"
        createNestedFolders(3, 3, "root");
    }
}