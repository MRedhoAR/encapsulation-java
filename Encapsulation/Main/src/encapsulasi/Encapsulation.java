package encapsulasi;
public class Encapsulation {
    
    //encapsulasi
    //=========================
    private String nama;
    private int npm;
    //=========================
    
    //constructor
    //=========================
    public String getNama()
    {
        return this.nama;
    }
    //=========================
    
    //pemanggilan tipe data private
    //================================
    public void BuatNama(String namamu)
    {
        this.nama=namamu;
    }
    //================================
    
    public int getNpm()
    {
        return this.npm;
    }
    public void BuatNpm(int npmmu)
    {
        this.npm=npmmu;
    }
}
