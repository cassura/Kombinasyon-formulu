
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        int n,r,result;
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyonu oluşturulacak birinci sayıyı giriniz:");
        n = input.nextInt();
        System.out.println("Kombinasyonu oluşturulacak ikinci sayıyı giriniz:");
        r = input.nextInt();

        int ntotal = 1;

        for (int i=1; i<=n; i++){
            ntotal = ntotal * i;
        }
        System.out.println("Birinci sayının faktöriyel değeri:"+ntotal);

        int rtotal = 1;

        for (int i=1; i<=r; i++){
            rtotal = rtotal * i;
        }
        System.out.println("İkinci sayının faktöriyel değeri:"+rtotal);

        int nrtotal =1;

        for (int i=1; i<=(n-r); i++){
            nrtotal = nrtotal * i;
        }
        System.out.println("Farkın faktöriyel sonucu:"+nrtotal);


        result = ntotal/(rtotal*nrtotal);
        System.out.println("İşlem sonucu:"+result);
        }
    }