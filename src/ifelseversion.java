import  java.util.Scanner;
public class ifelseversion {
    public static void main(String[] args) {
        int num1,num2,select;
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayısı Giriniz :");
        num1 = input.nextInt();
        System.out.print("2.Sayısı Giriniz :");
        num2=input.nextInt();

        System.out.println("1.Toplama \n 2.Çıkarma \n 3.Çarpma \n 4.Bölme");
        System.out.print("Yapmak İstediğiniz işlemi Seçinizi : ");
        select=input.nextInt();

        if (select == 1){
            System.out.println("Toplama =" + (num1+num2));
        }else if (select == 2){
            System.out.println("Çıkarma =" + (num1-num2));
        }else if (select == 3){
            System.out.println("Çarpma =" + (num1*num2));
        }else if (select == 4){
            if (num2 !=0){
                System.out.println("Bölme =" + (num1/num2));
            }else {
                System.out.println("Bir Sayı 0'a bölenemez!");
            }

        }else {
            System.out.println("Hatalı Bir Seçim Yaptınız!");
        }


    }
}
