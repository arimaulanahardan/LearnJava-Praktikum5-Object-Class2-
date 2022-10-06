package NewRestorant;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number;
		int jumlah;
		Penjualan restoran = new Penjualan();
		restoran.initMenu();
		restoran.tambahMenuMakanan("Bakso", 7000, 10);
		restoran.tambahMenuMakanan("Geprek", 11000, 10);
		Scanner sc = new Scanner(System.in);
		
		do {
			restoran.tampilkanMenu();
			System.out.print("\nNo makanan pada menu yang akan di beli: ");
			number = sc.nextInt();
			System.out.print("Jumlah yang akan dibeli: ");
			jumlah = sc.nextInt();
			restoran.order(number-1, jumlah);
			System.out.print("Apakah anda ingin memesan lagi? (y/n)");} while (sc.next().equals("y"));
		sc.close();
		System.out.printf("\nTotal harga yang harus dibayar: Rp. %.0f\n\n",restoran.getTotal_harga());
		}
	}
