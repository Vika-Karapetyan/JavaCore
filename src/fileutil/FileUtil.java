package fileutil;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String path = scanner.nextLine();
        String fileName = scanner.nextLine();
        String keyword = scanner.nextLine();
        String txtPath = scanner.nextLine();
        String content = scanner.nextLine();
        fileSearch(path, fileName);
        contentSearch(path, keyword);
        findLines(txtPath, keyword);
        printSizeOfPackage(path);
        createFileWithContent(path, fileName, content);


    }


    static void fileSearch(String path, String fileName) {
        Path paths = Paths.get(path);
        File file = new File(paths.toFile(), fileName);
        System.out.println(file.exists());

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch(String path, String keyword) {
        File file = new File(path);

    }

    static void findLines(String txtPath, String keyword) {
        Path filePath = Paths.get(txtPath);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    static void printSizeOfPackage(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        double S = 0;
        for (File f : files) {
            S += f.length();
        }
        System.out.println("Folder length: " + S);
    }

    static void createFileWithContent(String path, String fileName, String content) {
        Path filePath = Paths.get(path, fileName);

        try {
            Files.write(filePath, Collections.singleton(content));
            System.out.println(filePath.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

