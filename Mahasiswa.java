public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    String hobi;

    Mahasiswa(String nama, String nim, String jurusan, String hobi) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.hobi = hobi;
    }

    void tampilkanInfoMahasiswa() {
        System.out.println("Nama   : " + this.nama);
        System.out.println("NIM    : " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
        System.out.println("Hobi   : " + this.hobi);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Zhafira Ramadhani", "12350122936", "Teknik Informatika", "Membaca" );
        mahasiswa1.tampilkanInfoMahasiswa();
    }
}