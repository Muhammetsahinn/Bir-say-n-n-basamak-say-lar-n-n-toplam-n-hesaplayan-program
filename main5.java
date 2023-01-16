import java.util.Scanner;

public class main5 {

    public static void main(String[] args) {

        int number,toplam=0,tempNumber;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        number = inp.nextInt();
        while(number!=0) {
            tempNumber = number % 10;
            toplam += tempNumber;
            number = number / 10;
        }
        System.out.println("Sayinin rakamlari toplami : " +toplam);
        //System.out.println(number);


    }
}
