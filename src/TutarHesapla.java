import java.util.Scanner;

public class TutarHesapla {
    public static void main(String[] args) {
        double kdv,kdvliUrunTutari,kdvTutari;
        Scanner input=new Scanner(System.in);
        System.out.println("Ürün Tutarını Giriniz : ");
        double urunTutari=input.nextDouble();
        if(urunTutari>0&&urunTutari<1000){
            kdv=0.18;
            kdvTutari=urunTutari*kdv;
            kdvliUrunTutari=kdvTutari+urunTutari;
            System.out.println("ürünün"+"\nKDV\'siz fiyatı="+urunTutari+"\nKDV\'li fiyatı="+kdvliUrunTutari+"\nKDV tutarı="+kdvTutari);
        }else
        {
            kdv=0.08;
            kdvTutari=urunTutari*kdv;
            kdvliUrunTutari=kdvTutari+urunTutari;
            System.out.println("ürünün"+"\nKDV\'siz fiyatı="+urunTutari+"\nKDV\'li fiyatı="+kdvliUrunTutari+"\nKDV tutarı="+kdvTutari);
        }
    }
}
