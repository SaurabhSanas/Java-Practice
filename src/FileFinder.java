import java.io.File;

public class FileFinder {

    public void fileSearch(String fileName, String inputPath) {
        File dir = new File(inputPath);
        if(dir.isDirectory()){
            File[] dirFiles = dir.listFiles();
            for(File file : dirFiles){
                if(file.isDirectory())
                    fileSearch(fileName, file.getAbsolutePath());
                else
                    if(file.getName().equals(fileName))
                        System.out.println(inputPath + "\\" + fileName + " Found");
            }
        }
    }

    public static void main(String[] args){
        FileFinder fileFinder = new FileFinder();
        System.out.println("Searching File");
        fileFinder.fileSearch("Test.java", "C:\\Users\\LENOVO\\IdeaProjects\\Upgrad");
    }
}
