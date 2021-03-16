

package latihan;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukan kelas: ");
        String kelas = scanner.nextLine();
        
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
    }
}
