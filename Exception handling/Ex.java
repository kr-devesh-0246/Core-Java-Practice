public class Ex {
    public static void main(String[] args) {
        try {
            System.out.println("Open files");
            int n = args.length;
            System.out.println("n= " + n);
            int a = 45 / n;
            System.out.println("a= " + a);
            System.out.println("Closing the files");

            int b[] = { 10, 20, 30 };
            b[50] = 40;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
            System.out.println("Please pass non zero no of command line arguments");
        }
        // catch()
        finally {
            System.out.println("Closing the files");
        }
    }
}
