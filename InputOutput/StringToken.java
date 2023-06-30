import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringToken {
    public static void main(String args[]) throws IOException{
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        // String str = br.readLine();

        StringTokenizer st = new StringTokenizer("this is a test");
        // String str = "This is a tokenized string which behaves  exactly as the scanf() in c/c++";
        // StringTokenizer st = StringTokenizer(str);

        String token1;
        String token2;
        String token3;
        
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            token1 = st.nextToken();
            token2 = st.nextToken();
            token3 = st.nextToken();

        }
        System.out.println("Now storing this tokens into variables");
        System.out.println(token1);
        System.out.println(token2);
        System.out.println(token3);

    }
}
