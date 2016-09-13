package com.llp.nio;

import java.io.*;

/**
 * 作者： Joinly
 * 时间： 2016/8/3
 * 描述： ${todo}.
 */
public class Test {

    public static void io() {
        File inFile = new File("F://timg.jpg");
        File outFile = new File("D://timg.jpg");
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(inFile);
            outputStream = new FileOutputStream(outFile);

            int readCount = 0;
            byte[] buf = new byte[1024];

            while ((readCount = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, readCount);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test.io();
    }
}
