package Praktikum5;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant menu = new Restaurant();
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		System.out.println("Menu Makanan");
		menu.tampilMenuMakanan();
		System.out.println("");
		menu.order(1, 7);
		menu.tampilMenuMakanan();
		System.out.println("");
		menu.order(1, 15);
		System.out.println("");
		menu.order(0, 5);
		menu.tampilMenuMakanan();
		System.out.println("");
		menu.order(4, 5);
		System.out.println("");
		menu.order(0, 15);
		menu.tampilMenuMakanan();
		}
	}