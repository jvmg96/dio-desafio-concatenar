import java.util.Scanner;

public class Problem {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        for(int i = 0; i < count; i++) {
            var A = scan.next();
            var B = scan.next();

            if(A.endsWith(B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
    }
}