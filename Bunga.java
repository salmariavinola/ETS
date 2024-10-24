class Bunga {
    private String nama;
    private String warna;

    public Bunga(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public String informasi() {
        return nama + " adalah bunga berwarna " + warna + ".";
    }
}