package NewRestorant;

public class Penjualan {
	private Produk[] menu;
	private static byte id = 0;
	private double total_harga;
	
	public void initMenu() {
		menu = new Produk[20];
		menu[0] = new Produk("Batagor", 5_000, 10);
		menu[1] = new Produk("Roti bakar", 12_000, 10);
		menu[2] = new Produk("Indomie+Telor", 10_000, 10);
		menu[3] = new Produk("Kwetiaw", 12_000, 10);
		menu[4] = new Produk("Air Mineral", 3_000, 10);
		menu[5] = new Produk("Teh Manis", 4_000, 10);
		menu[6] = new Produk("Jus Alpukat", 8_000, 10);
		menu[7] = new Produk("Nasi Goreng", 12_000, 10);
		menu[8] = new Produk("Teh Botol", 5_000, 10);
		menu[9] = new Produk("Kopi", 3_000, 10);
		id = 9;
		}
	
public void tambahMenuMakanan(String nama_makanan, double harga, int qty) {
	if(id > 19) {
		System.out.println("Melebihi batas");
		return;
		}
	id++;
	menu[id] = new Produk(nama_makanan, harga, qty);
	}

public void tampilkanMenu() {
	System.out.println("\n\nDaftar Menu Makanan");
	System.out.println("=====================================================");
	
	for(int i=0; i<=id; i++) {
		System.out.printf("%2d. %-20s [%d] Rp.%.0f\n", i+1, 
				menu[i].getNama_makanan(), menu[i].getQty(), menu[i].getHarga());
		}
	}
public void order(int i, int qty) {
	if(i > Penjualan.id) {
		System.out.println("Makanan tidak ada pada menu");
		return;
		}
	
	if(qty < 1) {
		System.out.println("Tidak dapat membeli makanan sebanyak kurang dari 0");
		return;
		}
 
	if(menu[i].getQty()<qty) {
		System.out.println("Stok " + menu[i].getNama_makanan() + " tidak cukup");
		return;
		}
	menu[i].setQty(menu[i].getQty() - qty);
	System.out.println("Berhasil membeli " + menu[i].getNama_makanan() + "sebanyak " + qty);
	total_harga += menu[i].getHarga()*qty;
	}

public double getTotal_harga() {
	return total_harga;
	}
}
