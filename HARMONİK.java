import java.util.Scanner;
public class HARMONİK {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        double say,har;
        double top=0;
        System.out.println("değer giriniz");
        say= inp.nextInt();
        System.out.println("harmoni sayısını girin:");
        har= inp.nextInt();
        for(int i=1;i<=har;i++){
            top+=(say/i);
        }
        System.out.println("sonuç: "+top);
    }
}
