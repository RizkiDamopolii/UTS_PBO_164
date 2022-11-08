public class tendik extends Karyawan{
    private int lembur = 50000;
    private int jam;

    public tendik(String NIPbaru, String namaBaru, String alamatBaru, String TLBaru, String JenKelBaru, String TMBaru){
        this.NIP = NIPbaru;
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.TahunLahir = TLBaru;
        this.JenKel = JenKelBaru;
        this.TahunMasuk = TMBaru;
    }
    public void gaji(int jam){
        super.gajiTotal = super.gaji + (lembur * jam);
        System.out.println("Gaji Total    : " + super.gajiTotal);
    }

    public void gaji(){
        System.out.println("Gaji Pokok    : " + super.gaji);
    }


    @Override
    public void display(){
        System.out.println("\n\nData Tenaga Pendidik 1");
        System.out.println("NIP           : " + this.NIP);
        System.out.println("Nama          : " + this.nama);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("Tahun Lahir   : " + this.TahunLahir);
        System.out.println("Jenis Kelamin : " + this.JenKel);
        System.out.println("Tahun Masuk   : " + this.TahunMasuk);
    }
}
