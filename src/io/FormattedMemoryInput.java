package io;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * @author baiyunlong
 * @title FormattedMemoryInput
 * @description TODO
 * @date 2020/7/29 15:53
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {

        DataInputStream in =
                null;
        try {
            in = new DataInputStream(
                    new ByteArrayInputStream(BufferedInputFile
                            .read("C:\\Users\\Thinkpad\\Desktop\\发布车型入库-导入必传字段.txt")
                            .getBytes()));
            while (true) {
                System.out.print((char) in.readByte());
            }
        } catch (EOFException e) {
            System.out.println("End of stream");
        } finally {
            in.close();
        }
    }
}
