import java.io.*;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

class FileManager {

    private static int compare(File file1, File file2) {

        return file1.getName().compareTo(file2.getName());
    }

    private File rootDirectory;

    FileManager(String rootDirPath) {
        this.rootDirectory = new File(rootDirPath);
    }

    List<File> getFileList() {
        File[] fileArray = rootDirectory.listFiles();
        if (fileArray != null) {
            Arrays.sort(fileArray, FileManager::compare);
        }
        return fileArray != null ? asList(fileArray) : emptyList();
    }

    String readFile(File file) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line)
                        .append("\n");
            }
        }
        return stringBuilder.toString();
    }

    void writeFile(String fileName, String fileText) throws IOException {
        File file = new File(rootDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(fileText);
        }
    }

    void deletedFile(File file) throws IOException {
        try {
            if (file != null) {
                file.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void addText(File rootDirectory, String string) throws IOException {
        try (FileWriter fileWriter = new FileWriter(rootDirectory, true)) {// добавление теста!
            fileWriter.write(string);

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}