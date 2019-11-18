package praktikum;

public class data {
    private int angka;
    
    public void setAngka(int angka){
        this.angka = angka;
    }
    
    public int getAngka(){
        return angka;
    }
    
    public void cetak(){
        System.out.println("Angka = "+getAngka());
    }
}
