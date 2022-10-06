package NewRestorant;

public class Produk {
	private String nama_makanan;
	private double harga;
	private int qty;
 
public Produk(String nama_makanan, double harga, int qty) {
	this.nama_makanan = nama_makanan;
	this.harga = harga;
	this.qty = qty;
	}

public double getHarga() {
	return harga;
	}

public void setHarga(double harga) {
	this.harga = harga;
	}

public int getQty() {
	return qty;
	}

public void setQty(int qty) {
	this.qty = qty;
	}

public String getNama_makanan() {
	return nama_makanan;
	}

public void setNama_makanan(String nama_makanan) {
	this.nama_makanan = nama_makanan;
	}
}
