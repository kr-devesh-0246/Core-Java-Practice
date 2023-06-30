// package Inner Class;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BankAcct {
    private double bal;
    BankAcct(double b) {
        bal = b;
    }
    void contact(double r) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter password: "); 
        String passwd = String.valueOf(br.readLine());
        System.out.println("passwd = "+passwd);
        if(passwd.equals("xyz123")) {
            Interest in = new Interest(r);
            in.calculateInterest();
        }
        else {
            System.out.println("Sorry, you are not authorized");
            return;
        }
    }

    private class Interest {
        private double rate;
        Interest(double r) {
            rate = r;
        }
        void calculateInterest() {
            double interest = bal*rate/100;
            bal += interest;
            System.out.println("Updated balance= "+bal);
        }
    }
}



public class InnerClass {
    public static void main(String[] args) throws IOException {
        BankAcct account = new BankAcct(10000);
        account.contact(9.5);
    }
}
