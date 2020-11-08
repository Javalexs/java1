package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName) {
        try {
            FileReader reader = new FileReader(inFileName);
            FileWriter writer = new FileWriter(outFileName);

            try {
                int i;
                String str = "";
                while ((i = reader.read()) != 1) {
                    char symbol = (char) i;
                    str = str + code[(int) symbol];
                }
                writer.write(str);
            } finally {
                reader.close();
                writer.close();
            }
        } catch (Exception e) {
            try {
                FileWriter log = new FileWriter(logName);
                try {
                    log.write(e.getMessage());
                } finally {
                    log.close();
                }
            } catch (Exception ex) {
                System.out.println("Ошибка");
            }
        }
    }
}
