import java.util.Scanner;

public class cinZodyag {
    public static void main(String[] args) {
        
        int dogumYili;
        int sonuc;
        String Zodyag="";

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Dogum yilinizi giriniz:");
        dogumYili=scan.nextInt();

        sonuc=dogumYili%12;
        System.out.println(sonuc);

        switch (sonuc){
            case 0:
                Zodyag="MAYMUN";
                break;
            case 1:
                Zodyag="HORAZ";
                break;
            case 2:
                Zodyag="KOPEK";
                break;
            case 3:
                Zodyag="DOMUZ";
                break;
            case 4:
                Zodyag="FARE";
                break;
            case 5:
                Zodyag="OKUZ";
                break;
            case 6:
                Zodyag="KAPLAN";
                break;
            case 7:
                Zodyag="TAVSAN";
                break;
            case 8:
                Zodyag="EJDERHA";
                break;
            case 9:
                Zodyag="YILAN";
                break;
            case 10:
                Zodyag="AT";
                break;
            case 11:
                Zodyag="KOYUN";
                break;

        }
        System.out.println("cin zodaygi burcunuz: " + Zodyag);

        
    }
}
