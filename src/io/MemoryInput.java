package io;

import java.io.*;

/**
 * @author baiyunlong
 * @title MemoryInput
 * @description TODO
 * @date 2020/7/29 15:42
 */
public class MemoryInput {
    public static void main(String[] args) {
        try {
            StringReader stringReader =
                    new StringReader(BufferedInputFile
                            .read("C:\\Users\\Thinkpad\\Desktop\\发布车型入库-导入必传字段.txt"));
            int c;
            while ((c = stringReader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
