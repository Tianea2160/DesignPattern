package decorator.customIO;

import org.junit.jupiter.api.Test;

import java.io.*;

public class CustomIOTest {
    @Test
    void 커스텀_인풋스트림_사용해보기() throws IOException {

        File file = new File("");
        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(file)));
        int c = 0;
        StringBuilder sb = new StringBuilder();
        while((c = in.read()) >=0){
            sb.append((char)c);
        }
        System.out.println(sb);
    }
}
