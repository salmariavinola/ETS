class BungaTulip extends Bunga {
    private int tinggi;

    public BungaTulip(String warna, int tinggi) {
        super("Tulip", warna);
        this.tinggi = tinggi;
    }

    @Override
    public String informasi() {
        return super.informasi() + " Tinggi: " + tinggi + " cm.";
    }
}