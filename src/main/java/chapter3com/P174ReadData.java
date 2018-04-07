/***********************************************************
 * @Description : 
 * @author      : 梁山广(Laing Shan Guang)
 * @date        : 2018/4/7 下午7:02
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package chapter3com;

import java.io.IOException;
import java.io.PipedReader;

public class P174ReadData {
    public void readMethod(PipedReader in) {
        try {
            System.out.println("read : ");
            // 每次读取20个比特
            char[] bytes = new char[20];
            int readLength = in.read(bytes);
            while (readLength != -1) {
                String newData = new String(bytes, 0, readLength);
                System.out.print(newData);
                readLength = in.read(bytes);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
