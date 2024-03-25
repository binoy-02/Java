import java.io.File;

public class FileSearch {
    public static void main(String[] args) {
      
        String directoryPath = "D:/Binoy/javalab/java10";
        String fileNameToSearch = "Consumer.class"; 

        
        searchFile(new File(directoryPath), fileNameToSearch);
    }

    public static void searchFile(File directory, String fileNameToSearch) {
        
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    
                    searchFile(file, fileNameToSearch);
                } else {
                   
                    if (file.getName().equals(fileNameToSearch)) {
                      
                        System.out.println("File found: " + file.getAbsolutePath());
                    }
                }
            }
        }
    }
}
