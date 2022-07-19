import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int num1,num2,select;
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayıyı Giriniz :");
        num1=input.nextInt();
        System.out.print("2.Sayıyı Giriniz :");
        num2=input.nextInt();

        System.out.println("1.Toplama \n 2.Çıkarma \n 3.Çarpma \n 4.Bölme");
        System.out.print("Yapmak İstediğiniz işlemi Seçinizi : ");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println("Seçilen İşlem Toplama :");
                System.out.print(num1+" + "+num2+" = " + (num1+num2));
                break;
            case 2:
                System.out.println("Seçilen İşlem Çıkarma :");
                System.out.print(num1+" - "+num2+" = " + (num1-num2));
                break;
            case 3:
                System.out.println("Seçilen İşlem Çarpma :");
                System.out.print(num1+" * "+num2+" = " + (num1*num2));
                break;
            case 4:
                System.out.println("Seçilen İşlem Bölme :");
                if (num2 !=0){
                    System.out.print(num1+" / "+num2+" = " + (num1/num2));
                }else {
                    System.out.println("Bir Sayı 0'a bölünemez!");
                }

                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız.");
        }

    }
}
