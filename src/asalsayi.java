import java.util.Scanner;
public class asalsayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean isPrime=true;

        System.out.print("sayıyı giriniz:");
        int n=input.nextInt();
        for (int i=2; i<n; i++){

            if (n%i==0){
                isPrime=false;
                break;

            }
        }
        if (isPrime){
            System.out.print(n + " asal sayıdır." );

        }else {
            System.out.print(n + " asal sayı değildir." );
        }


    }
}
