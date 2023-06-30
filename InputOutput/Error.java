import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Error {
    public static void main(String args[]) throws IOException {
        System.out.println("Hello World!");
        System.err.println("An error has occured!");

        // InputStreamReader obj  = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(obj);

        // System.out.print("Enter a character: ");
        // char ch = (char) br.read();
        // System.out.println(ch);
        
        // System.out.print("Enter a string: ");
        // String str = br.readLine();
        // System.out.println(str);

        // System.out.print("Enter a string containing int: ");
        // String s = br.readLine();

        // int n = Integer.parseInt(s);
        // System.out.println("int: "+n);

        // float flt = Float.parseFloat(s);
        // System.out.println("float: "+flt);

        // double d = Double.parseDouble(s);
        // System.out.println("double: "+d);

        // byte b = new Byte.parseByte(s); 
        // System.out.println("byte: "+b);

        // try it for short, long and boolean

        StringTokenizer st = new StringTokenizer("This is a tokenized string.");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        
        


    }
}