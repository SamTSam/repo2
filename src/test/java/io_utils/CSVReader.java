package io_utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;

public class CSVReader {
    private final String path;
    private final FileReader reader; // reads byte by byte
    private final BufferedReader bufferedReader;//reads line by line

    public CSVReader(String path) throws FileNotFoundException {
        this.path = path;
        this.reader = new FileReader(path);
        this.bufferedReader = new BufferedReader(reader);

    }

    public String read() throws IOException {
        String line = bufferedReader.readLine();
        return line;
    }
    public void close() throws  IOException {
        String line = bufferedReader.readLine();

        //hi


    }
}
