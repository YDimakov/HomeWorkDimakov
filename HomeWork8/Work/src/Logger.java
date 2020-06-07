import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static menu.PathFile.HISTORY_WORK;

class Logger {// история работы программы

    protected void timeWork(String message, String file) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        try {
            FileWriter fileWriter = new FileWriter(HISTORY_WORK, true);
            fileWriter.write("\n" + dateFormat.format(date) + " - " + file + " - " + message);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}