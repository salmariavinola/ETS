class BungaMawar extends Bunga {
    private String jenis;

    public BungaMawar(String warna, String jenis) {
        super("Mawar", warna);
        this.jenis = jenis;
    }

    @Override
    public String informasi() {
        return super.informasi() + " Jenis: " + jenis + ".";
    }
}