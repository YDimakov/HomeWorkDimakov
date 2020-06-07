import exception.MenuActionException;
import menu.item.MainMenuAction;
import menu.item.MenuItem;
import zip.Archive;
import zip.UnZip;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static menu.MainMenuTextConst.*;
import static menu.MenuFactory.getMainMenu;
import static menu.PathFile.*;

class Menu {

    private FileManager fileManager;
    private Scanner scanner;
    private File file1, file2, file3;
    private String text;
    private String fileName;

    Menu(String rootDirPath) {
        this.fileManager = new FileManager(rootDirPath);
        this.scanner = new Scanner(System.in);
    }

    Logger logger = new Logger();

    void start() {
        logger.timeWork(INPUT, "!");
        while (true) {
            printMenuItems(getMainMenu(MainMenuAction.values()));
            try {
                int menuNumber = readIntFromConsole();
                MainMenuAction mainMenuAction = MainMenuAction.getMainMenuAction(menuNumber);
                mainMenuAction(mainMenuAction);
            } catch (MenuActionException e) {
                e.printStackTrace();
                printText(ACTION_ITEM_ERROR_MESSAGE);
            }
        }
    }

    private void mainMenuAction(MainMenuAction mainMenuAction) {
        switch (mainMenuAction) {
            case READ_FILE:
                workWithFiles();
                logger.timeWork(READ_FILE_MESSAGE, file1.getName());
                break;
            case ADD_FILE:
                addNewFileAction();
                logger.timeWork(WRITE_FILE_MESSAGE, fileName);
                break;
            case DELETED_FILE:
                deletedFileAction();
                logger.timeWork(DELETED_FILE_MESSAGE, file2.getName());
                break;
            case ADD_TEXT:
                addTextAction();
                logger.timeWork(ADD_TEXT_MESSAGE, file3.getName());
                break;
            case ZIP_FILE:
                zipArchive();
                break;
            case EXIT:
                logger.timeWork(EXIT, "!");
                System.exit(0);
        }
    }

    private void workWithFiles() { // чтение файла
        List<File> files = fileManager.getFileList();
        printFiles(files);
        file1 = files.get(readIntFromConsole());
        try {
            text = fileManager.readFile(file1);
            System.out.println(CHANGES);
        } catch (IOException e) {
            e.printStackTrace();
            text = READ_FILE_ERROR_MESSAGE;
        }
        printText(text);
    }

    private void addNewFileAction() {
        fileName = readStringFromConsole();
        String fileText = readStringLines();
        try {
            fileManager.writeFile(fileName, fileText);
            printText(CHANGES);
        } catch (IOException e) {
            e.printStackTrace();
            printText(WRITE_FILE_ERROR_MESSAGE);
        }
    }

    private <T> void printText(T text) {

        System.out.println(text.toString());
    }

    private void printFiles(List<File> files) {
        for (int i = 0; i < files.size(); i++) {
            File file = files.get(i);
            printText(String.format(ITEM_WITH_NUMBER, i, file.getName()));
        }
    }

    private void printMenuItems(List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems) {
            System.out.println(menuItem);
        }
    }

    private int readIntFromConsole() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private String readStringFromConsole() {
        return scanner.nextLine();
    }


    private String readStringLines() {
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = readStringFromConsole()) != null && !line.equals("*exit")) {
            stringBuilder.append(line);
        }
        return stringBuilder.toString();
    }

    private void deletedFileAction() { // удаление файла

        List<File> files = fileManager.getFileList();
        printFiles(files);
        file2 = files.get(readIntFromConsole());
        try {
            fileManager.deletedFile(file2);
            printText(CHANGES);
        } catch (IOException e) {
            e.printStackTrace();
            printText(DELETED_FILE_ERROR_MESSAGE);
        }
    }

    private void addTextAction() { // добавление текста
        List<File> files = fileManager.getFileList();
        printFiles(files);
        file3 = files.get(readIntFromConsole());
        fileName = readStringFromConsole();
        try {
            fileManager.addText(file3, fileName + "\n");
            System.out.println(CHANGES);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(ADD_TEXT_ERROR_MESSAGE);
        }
    }

    private void zipArchive() { //архивация
        System.out.println("1- " + ITEM_TEXT_ZIP_ARCHIVE + "\n2- " + ITEM_TEXT_ZIP_UNZIP);
        if (readIntFromConsole() == 1) {
            Archive archive = new Archive();
            archive.launchArchive();
            logger.timeWork(SAVE_TEXT_ZIP_ARCHIVE, "!");
            System.out.println("Архив создан в " + OUTPUT_ZIP_FILE + "\n");
        } else {
            UnZip unZip = new UnZip();
            unZip.unZipIt(OUTPUT_ZIP_FILE, SOURCE_FOLDER2_GIVE);
            logger.timeWork(SAVE_TEXT_UNZIP_ARCHIVE, "!");
            System.out.println("Файлы восстановлены в " + SOURCE_FOLDER2_GIVE + "\n");
        }
    }

}