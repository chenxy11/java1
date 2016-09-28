import com.chenxy.java1.Java1Prac;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        try {
            Java1Prac.writeAndRead();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
