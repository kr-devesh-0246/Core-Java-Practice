/*
 * Program to take input of website name and returns the IP address 
 * Caution: new keyword is not used in ip object declaration
 */

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Program1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a website name: ");
        String site = br.readLine();
        try {
            InetAddress ip = InetAddress.getByName(site); // find out why new keyword not used.
            System.out.println("The IP Address is " + ip);
        } catch (UnknownHostException uhe) {
            System.out.println("Website not found");
        }
    }
}