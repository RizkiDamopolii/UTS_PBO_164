public class dosen extends Karyawan{
    protected String jurusan;
    protected String nidn;
    private int banyakSKS;
    private int sksPerMinggu = 100000;

    public dosen(String NIPbaru, String namaBaru, String alamatBaru, String TLBaru, String JenKelBaru, String TMBaru, String jurusanBaru, String nidnBaru){
        this.NIP = NIPbaru;
        this.nama = namaBaru;
        this.alamat = alamatBaru;
        this.TahunLahir = TLBaru;
        this.JenKel = JenKelBaru;
        this.TahunMasuk = TMBaru;
        this.jurusan = jurusanBaru;
        this.nidn = nidnBaru;
    }

    public void gaji(int banyakSKS){
        super.gajiTotal = super.gaji + ((banyakSKS * 4) * sksPerMinggu);
        System.out.println("Gaji Total    : " + super.gajiTotal);
    }

    public void gaji(){
        System.out.println("Gaji Pokok    : " + super.gaji);
    }


    @Override
    public void display() {
        System.out.println("Data Dosen 1");
        System.out.println("NIP           : " + this.NIP);
        System.out.println("Nama          : " + this.nama);
        System.out.println("Alamat        : " + this.alamat);
        System.out.println("Tahun Lahir   : " + this.TahunLahir);
        System.out.println("Jenis Kelamin : " + this.JenKel);
        System.out.println("Tahun Masuk   : " + this.TahunMasuk);
        System.out.println("Jurusan       : " + this.jurusan);
        System.out.println("NIDN          : " + this.nidn);
    }
}
