package java10;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader {

    public static void main(String[] args) {
        String fileURL = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"; 
        String saveDir = "E:\\Binoy\\RCSS\\S2\\JavaLab\\Java02";
        try {
            downloadFile(fileURL, saveDir);
            System.out.println("File downloaded successfully!");
        } catch (Exception e) {
            System.err.println("Error downloading file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void downloadFile(String fileURL, String saveDir) throws Exception {
        URL url = new URL(fileURL);
        URLConnection conn = url.openConnection();
        InputStream inputStream = conn.getInputStream();

      
        if (!saveDir.endsWith("\\")) {
            saveDir += "\\";
        }
        String fileName = fileURL.substring(fileURL.lastIndexOf("/") + 1);
        String saveFilePath = saveDir + fileName;

        try (FileOutputStream outputStream = new FileOutputStream(saveFilePath)) {
            int bytesRead;
            byte[] buffer = new byte[1024];
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
        }

        inputStream.close();
    }}

