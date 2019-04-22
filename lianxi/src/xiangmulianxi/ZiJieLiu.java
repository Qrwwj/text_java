package xiangmulianxi;

import java.io.*;

/**
 * @Author: wwj
 * @Date: 2019/1/19 13:17
 * @Description: 真的很累吗?累就对了,舒服是留给死人的!
 */
public class ZiJieLiu {
    public static void main(String[] args) {

//        字节流   输入流
        File file = new File("D:\\临时\\3.1\\test.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            byte[] arr = new byte[(int) file.length()];
            is.read(arr);
            for (byte b : arr
                    ) {
                System.out.println(b);
            }
            System.out.println(new String(arr));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("--------------------------");

//写
        try {
            OutputStream os=new FileOutputStream(file,true);
            String str="asdahsjkdxncmvndhf中文";
            os.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
