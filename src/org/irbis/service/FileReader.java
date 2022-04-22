package org.irbis.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    public static List<String> readAllLines(String path) {
        return readLinesFromCsv(path, false);
    }

    public static List<String> readLinesWithoutHeader(String path) {
        return readLinesFromCsv(path, true);
    }

    private static List<String> readLinesFromCsv(String path, boolean skipHeader) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            if (skipHeader) {
                lines.remove(0);
            }
            return lines;
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
