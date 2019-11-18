package praktikum;
import java.util.Scanner;
public class app{
    static Scanner in = new Scanner(System.in);
    static data[] angkaarr = new data[10];
    
    public static void main(String[] args) {
        
        int pilih=1,batas=0;
        do{
            System.out.println("Menu\n1.Insert\n2.Update\n3.View\n4.delete");
            System.out.print("Pilih ");
            pilih = in.nextInt();
            switch(pilih){
                case 1:
                    app.input(batas);
                    batas = batas + 1;
                    break;
                    
                case 3:
                    app.output(batas);
                    break;
            }
        }while(pilih!=0);
    }
    
    static void input(int batas){
        data data = new data();
        System.out.print("Masukkan Angka: ");
        int angka = in.nextInt();
        data.setAngka(angka);
        
        angkaarr[0] = data;
    }
    
    static void output(int batas){
        System.out.println("Data Angka");
        for(int i=0; i<=batas;i++){
            System.out.println(angkaarr[i].getAngka());
        }
    }
    
    
}
