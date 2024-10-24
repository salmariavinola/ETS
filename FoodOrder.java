import java.util.ArrayList;
import java.util.List;

public class FoodOrder {
    private List<String> menuItems; // Daftar menu yang dipesan
    private double totalPrice; // Total harga pemesanan
    private boolean isPaid; // Status pembayaran

    // Constructor
    public FoodOrder() {
        this.menuItems = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;
    }

    // Metode untuk menambahkan menu item
    public void addMenuItem(String item, double price) {
        menuItems.add(item);
        totalPrice += price; // Tambah total harga
    }

    // Metode untuk menghitung total harga
    public double calculateTotal() {
        return totalPrice;
    }

    // Metode untuk menandai sebagai sudah dibayar
    public void markAsPaid() {
        isPaid = true;
    }

    // Metode untuk mendapatkan daftar menu yang dipesan
    public List<String> getMenuItems() {
        return menuItems;
    }

    // Metode untuk memeriksa apakah pesanan sudah dibayar
    public boolean isOrderPaid() {
        return isPaid;
    }
}