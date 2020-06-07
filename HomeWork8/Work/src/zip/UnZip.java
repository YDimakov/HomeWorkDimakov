package zip;

import java.io.*;
import java.util.zip.*;

import static menu.PathFile.SOURCE_FOLDER2_GIVE;

public class UnZip {//разархивация файлов

    public void unZipIt(String zipFile, String outputFolder) {

        byte[] buffer = new byte[1024];

        try {
            File folder = new File(SOURCE_FOLDER2_GIVE);
            if (!folder.exists()) {
                folder.mkdir();
            }
            ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFile));
            ZipEntry ze = zis.getNextEntry();
            while (ze != null) {
                String fileName = ze.getName();
                File newFile = new File(outputFolder + File.separator + fileName);
                new File(newFile.getParent()).mkdirs();
                FileOutputStream fos = new FileOutputStream(newFile, false);//перезапись файлов
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }

                fos.close();
                ze = zis.getNextEntry();
            }
            zis.closeEntry();
            zis.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}