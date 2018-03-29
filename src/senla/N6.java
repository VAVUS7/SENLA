package senla;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N6 {
    public static void main(String[] args) throws IOException{
        System.out.println(
                new BufferedReader(new InputStreamReader(System.in))
                        .readLine()
                        .replaceAll("(\\d+\\.\\d+)|(\\d+)", "")
        );
    }
}

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String st = reader.readLine();
//        System.out.println(st.replaceAll("(\\d+\\.\\d+)|(\\d+)", ""));