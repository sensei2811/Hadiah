package teoritugas;
import java.util.Scanner;
public class TeoriTugas {
public static void main(String[] args) {
 Scanner input = new Scanner (System.in);
 System.out.println("Menghitung Nilai Mahasiswa");
 String name;
 int t1,t2,t3,mid,fnal;
 System.out.print("Masukan Nama :"); name = input.next();
 System.out.print("Masukan Nilai Tugas 1 :"); t1 = input.nextInt();
 System.out.print("Masukan Nilai Tugas 2 :"); t2 = input.nextInt();
 System.out.print("Masukan Nilai Tugas 3 :"); t3 = input.nextInt();
 System.out.print("Masukan Nilai Mid :"); mid = input.nextInt();
 System.out.print("Masukan Nilai Final :"); fnal = input.nextInt();
 double rata2 = (double)(t1+t2+t3)/3;
 double total = (double)(rata2*30/100)+(mid*30/100)+(fnal*40/100);
 if (total >=80 && total<=100){
 System.out.println("Nama ="+name);
 System.out.println("Nilai Akhir ="+total);
 System.out.println("Dapat Nilai A");
 }
 else if (total >=60 && total<=79){
     System.out.println("Nama ="+name);
     System.out.println("Nilai Akhir ="+total);
     System.out.println("Dapat Nilai B");
 }
 else if (total>=50 && total<=59){
    System.out.println("Nama ="+name);
    System.out.println("Nilai Akhir ="+total);
    System.out.println("Dapat Nilai C");
}
 else if (total>=40 && total<=49){
    System.out.println("Nama ="+name);
    System.out.println("Nilai Akhir ="+total);
    System.out.println("Dapat Nilai D");
}
 else{
         System.out.println("Nama ="+name);
         System.out.println("Nilai Akhir ="+total);
         System.out.println("Dapat Nilai E");
         }
    }
    
}
