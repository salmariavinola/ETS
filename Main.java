import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FoodOrder order = new FoodOrder();

        // Input menu items dari pengguna
        System.out.println("Masukkan jumlah item yang ingin dipesan:");
        int itemCount = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline setelah nextInt

        for (int i = 0; i < itemCount; i++) {
            System.out.println("Masukkan nama menu item:");
            String itemName = scanner.nextLine();
            System.out.println("Masukkan harga item:");
            double itemPrice = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline setelah nextDouble
            order.addMenuItem(itemName, itemPrice);
        }

        // Menghitung total harga
        double total = order.calculateTotal();
        System.out.println("Total harga pemesanan: " + total + " IDR");

        // Menampilkan daftar menu yang dipesan
        System.out.println("Daftar menu yang dipesan: " + order.getMenuItems());

        // Menanyakan status pembayaran
        System.out.println("Apakah pesanan sudah dibayar? (ya/tidak)");
        String paymentStatus = scanner.nextLine();
        if (paymentStatus.equalsIgnoreCase("ya")) {
            order.markAsPaid();
        }

        // Menampilkan status pembayaran
        System.out.println("Apakah pesanan sudah dibayar? " + order.isOrderPaid());

        // Menutup scanner
        scanner.close();
    }
}
