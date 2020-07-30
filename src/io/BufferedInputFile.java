package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author baiyunlong
 * @title BufferedInputFile
 * @description TODO
 * @date 2020/7/29 15:45
 */
public class BufferedInputFile {
    public static String read(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuilder buffer = new StringBuilder();
        while ((s = reader.readLine()) != null) {
            buffer.append(s).append("\n");
        }
        reader.close();
        return buffer.toString();
    }
}
