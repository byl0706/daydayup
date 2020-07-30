package io;

import java.io.*;

/**
 * @author baiyunlong
 * @title StoringAndRecover
 * @description TODO
 * @date 2020/7/30 14:31
 */
public class StoringAndRecover {
    public static void main(String[] args) {
        DataInputStream in = null;
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt")));
            out.writeDouble(3.141592653579);
            out.writeInt(100000);
            out.writeUTF("哇123");
            out.writeUTF("456");
            out.writeUTF("999");
            out.flush();
            out.close();
            in = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));
            System.out.println(in.readDouble());
            System.out.println(in.readInt());
            System.out.println(in.readUTF());
            System.out.println(in.readUTF());
            System.out.println(in.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.flush();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
