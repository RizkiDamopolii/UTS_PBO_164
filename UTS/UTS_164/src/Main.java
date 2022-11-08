public class Main {
    public static void main(String[] args) {
        dosen Dosen1 = new dosen("111", "Budi", "Jakal", "01-01-1992", "Pria", "2009", "Informatika", "1112");
        Dosen1.display();
        Dosen1.gaji();
        Dosen1.gaji(6);

        tendik Tendik1 = new tendik("101", "Adi", "Seturan", "02-02-1991", "Pria", "2010");
        Tendik1.display();
        Tendik1.gaji();
        Tendik1.gaji(20);
    }
}