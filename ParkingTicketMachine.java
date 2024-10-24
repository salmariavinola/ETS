public class ParkingTicketMachine {
    private int balance;      // Jumlah nominal uang yang dimasukkan
    private final int ticketPrice; // Harga tiket parkir per jam
    private int ticketTime;    // Jumlah waktu parkir yang dibeli dalam jam

    // Constructor
    public ParkingTicketMachine(int ticketPrice) {
        this.ticketPrice = ticketPrice; // Inisialisasi harga tiket
        this.balance = 0;                // Inisialisasi saldo
        this.ticketTime = 0;             // Inisialisasi waktu parkir
    }

    // Menambahkan uang yang dimasukkan
    public void insertMoney(int amount) {
        balance += amount; // Tambahkan jumlah uang ke saldo
    }

    // Mengeluarkan tiket berdasarkan uang yang dimasukkan
    public void issueTicket() {
        if (balance >= ticketPrice) {
            ticketTime = balance / ticketPrice; // Hitung waktu parkir
            System.out.println("Tiket dikeluarkan untuk " + ticketTime + " jam.");
            balance = 0; // Reset saldo setelah tiket dikeluarkan
        } else {
            System.out.println("Saldo tidak cukup untuk mengeluarkan tiket.");
        }
    }

    // Mengembalikan jumlah jam parkir yang telah dibeli
    public int getTimePurchased() {
        return ticketTime; // Kembalikan waktu parkir yang dibeli
    }
}
