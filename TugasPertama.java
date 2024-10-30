import java.util.Scanner;

public class TugasPertama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMhs, nilai, rata2, tertinggi, terendah;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlahMhs = sc.nextInt();
        int [] arrNilai = new int [jumlahMhs];

        for (int i = 0; i<arrNilai.length;i++){
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1)+":");
            arrNilai [i] = sc.nextInt();
        }

    }
}
