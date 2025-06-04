public void setHarga (int harga) {}
public void setHarga (double harga) {}
public void setHarga (float harga) {}
public void setHarga (float harga, string jumlah) {}
public class Phone {
    private String merk;
    private int harga;

    public Phone() {
    }

    public Phone(String merk) {
        this.merk = merk;
    }

    public Phone(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }

    public void lihatPhone() {
        System.out.println("Merk : " + merk);
        System.out.println("Harga : " + harga);
        System.out.println("");
    }

    public void isiPhone(String merk) {
        this.merk = merk;
    }

    public void isiPhone(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }
}

public class DemoOverLoading {
    public static void main(String args[]) {
        System.out.println("");

        Phone p1 = new Phone();
        Phone p2 = new Phone("Nokia");
        Phone p3 = new Phone("Sony Ericson", 500);

        System.out.println("Perbedaan output dari masing-masing konstruktor:");
        p1.lihatPhone();
        p2.lihatPhone();
        p3.lihatPhone();

        Phone p4, p5;
        p4 = new Phone();
        p5 = new Phone();
        p4.isiPhone("Samsung");
        p5.isiPhone("Samsung", 5000);

        System.out.println("Perbedaan output dari masing-masing method:");
        p4.lihatPhone();
        p5.lihatPhone();
    }
}