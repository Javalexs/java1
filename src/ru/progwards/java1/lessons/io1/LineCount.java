package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.util.Scanner;

public class LineCount {
    public static int calcEmpty(String fileName) {
        int z = 0;
        try {
            FileReader reader = new FileReader(fileName);
            Scanner scanner = new Scanner(reader);
            try {
                while (scanner.hasNextLine()) {
                    if (scanner.nextLine().isEmpty()) {
                        z++;
                    }
                }
            } finally {
                scanner.close();

            }
            return z;
        } catch (Exception e) {
            return -1;
        }
    }

}

