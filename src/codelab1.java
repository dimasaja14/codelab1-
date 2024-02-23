import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class codelab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr, formatter);

        LocalDate sekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahir, sekarang);

        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Tanggal Lahir: " + formatter.format(tanggalLahir));
        System.out.println("Umur: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan " + umur.getDays() + " hari");

        scanner.close();
    }
}
