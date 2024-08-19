//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat objek
        //namaClass namaObjek = newConstructor();
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa sativa = new Siswa();
        Siswa nasya = new Siswa();
        Siswa zahra = new Siswa();

        sabrina.id = 32;
        sabrina.nama = "Sabrina";
        sabrina.ipk = 85.7;
        rasyid.id = 30;
        rasyid.nama = "Rasyid";
        rasyid.ipk = 88.5;
        sativa.id = 31;
        sativa.nama = "Sativa";
        sativa.ipk = 87.6;
        nasya.id = 26;
        nasya.nama = "Nasya";
        nasya.ipk = 98.5;
        zahra.id = 35;
        zahra.nama = "Zahra";
        zahra.ipk = 92.3;


        sabrina.print();
        rasyid.print();
        sativa.print();
        nasya.print();
        zahra.print();

    }
}