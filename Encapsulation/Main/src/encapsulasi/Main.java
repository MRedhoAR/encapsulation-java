package encapsulasi;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Encapsulation object = new Encapsulation();
        
        //Input Data
        //================================
        System.out.print(" Nama : ");
        object.BuatNama(input.nextLine());
        System.out.print(" Npm : ");
        object.BuatNpm(input.nextInt());
        //================================
        
        //Output Data
        //==================================================
        System.out.println(" Nama mu : "+object.getNama());
        System.out.println(" NPM mu  : "+object.getNpm());
        //==================================================
        
    }
    
}
