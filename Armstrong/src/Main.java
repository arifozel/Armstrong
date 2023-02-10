

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Sayı Giriniz : ");
        int basTop = 0;
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
             tempNumber = number;
            while (tempNumber != 0 ){
                basValue = tempNumber % 10;
                basTop += basValue;
                result += basTop;
                tempNumber /= 10;
            }   System.out.println(number + " sayısının basamak değeri toplamı : " + result);


       int basPow;
        while (tempNumber!=0){
            basValue = tempNumber % 10;
            basPow = 1;
            for (int i =1; i <= basNumber; i++){
                 basPow *= basValue;
            }
                 result += basPow;
                 tempNumber /= 10;
        }
            if (result == number){
                System.out.println(number+ " sayısı armstrong sayısıdır.");
            }else {
                System.out.println(number+ " sayısı armstrong sayı değildir.");
            }
    }
}
