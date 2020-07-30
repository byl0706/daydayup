package io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author baiyunlong
 * @title TextFile
 * @description 简化文件的写入写出操作
 * @date 2020/7/30 15:12
 */
public class TextFile extends ArrayList<String> {
    public static String read(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader in = null;
        try {
            in =
                    new BufferedReader(
                            new FileReader(new File(fileName).getAbsolutePath()));
            String s;
            while ((s= in.readLine()) != null) {
                stringBuilder.append(s).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsolutePath());
            try {
                out.print(text);
            } finally {
                out.flush();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(Objects.requireNonNull(read(fileName)).split(splitter)));
        if ("".equals(get(0))) {
            remove(0);
        }
    }

    public TextFile(String fileName) {
        this(fileName, "\n");
    }

    public void write(String fileName) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsolutePath());
            try {
                for (String item : this) {
                    out.println(item);
                }
            } finally {
                out.flush();
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String file = read("data.txt");
        write("data2.txt", file);
        TextFile textFile = new TextFile("data.txt");
        textFile.write("data2.txt");
        TreeSet<String> words = new TreeSet<>(new TextFile("D:\\车辆准入\\work space\\study\\src\\io\\TextFile.java", "\\w+"));
        System.out.println(words.headSet("a"));
    }
}
