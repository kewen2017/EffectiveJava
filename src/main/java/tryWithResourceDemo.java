import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryWithResourceDemo {
    static String firstLineOffFile(String path) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        }
        finally {
            br.close();
        }
    }
    static String firstLineOffFileWithResource(String path) throws IOException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }

    }

}
