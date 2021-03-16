

package latihan;

public class Latihan3 {
    public static void main(String[] args) {
        buku book1 = new buku();
        book1.setInfoBuku("Jingga dan Kuning", 8);
        book1.showInfoBuku();
    }
}

class buku {
    String judul;
    int jumlah;
    
    public void setInfoBuku(String judul, int jumlah) {
        
        this.judul = judul;
        this.jumlah = jumlah;
        
    }
    
    public void showInfoBuku() {
        
        System.out.println("Judul buku: " + judul);
        System.out.println("Jumlah buku: " + jumlah);
        
    }
    
}
