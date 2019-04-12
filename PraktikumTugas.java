package praktikumtugas;
import java.util.Scanner;
public class PraktikumTugas {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int []bil=new int[100];
int maks,minimum;
int a;
for (a=1;a<=5;a++){
    System.out.print("Nilai ke-"+a+" : ");
    bil[a] = input.nextInt();
}
maks=0;
minimum=bil[1];
for(a=1;a<=5;a++)
{
    if(maks<bil[a]){
        maks=bil[a];
    }
    else if(minimum>bil[a]){
        minimum=bil[a];
    }
}
System.out.println();
System.out.println("Nilai MAX : "+maks);
System.out.println("Nilai MIN : "+minimum);
    }
    
}
