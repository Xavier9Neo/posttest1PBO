package BALI;

public class Alat extends cinderamata{
    private String IdAlat;
    private String JenisAlat;
    public Alat(String namacdm, int hargacdm ,String IdAlat, String JenisAlat){
        super(namacdm,hargacdm);
        this.IdAlat = IdAlat;
        this.JenisAlat = JenisAlat;
    }
    public String getIdAlat() {
        return IdAlat;
    }
    public String getJenisAlat() {
        return JenisAlat;
    }
    public void setIdAlat(String idAlat) {
        IdAlat = idAlat;
    }
    public void setJenisAlat(String jenisAlat) {
        JenisAlat = jenisAlat;
    }
    public void tampil(){
        System.out.println("Nama :" + this.namacdm);
        System.out.println("Harga :" + this.hargacdm);
    }
}
