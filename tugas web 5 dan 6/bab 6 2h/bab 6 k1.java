class namasuperclass {
    //body kelas
}

class namasubclass extends namasuperclass {
    //body kelas
}

public class PersegiPanjang {
    private int panjang;
    private int lebar;

    public void setPanjang(int p) {
        panjang = p;
    }

    public void setLebar(int l) {
        lebar = l;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int Luas() {
        int luas = panjang * lebar;
        return luas;
    }
}

public class Balok extends PersegiPanjang {
    private int tinggi;

    public void setTinggi(int t) { 
        tinggi = t; 
    }

    public int getTinggi() { 
        return tinggi; 
    }

    public int Volume() { 
        int v = getPanjang() * getLebar() * tinggi; 
        return v; 
    }
}

public class DemoPewarisan {
    public static void main(String[] args[]) {
        PersegiPanjang a = new PersegiPanjang();
        a.setPanjang(5);
        a.setLebar(5);
        System.out.println("");
        System.out.println("Contoh program pewarisan");
        System.out.println("");
        System.out.println("Superclass PersegiPanjang");
        System.out.println("Panjang : " + a.getPanjang());
        System.out.println("Lebar : " + a.getLebar());
        System.out.println("Luas : " + a.Luas());
        System.out.println("");

        Balok b = new Balok();
        /* kelas balok tinggal memanggil method yang ada didalam kelas persegi */
        b.setPanjang(4);
        b.setLebar(3);
        b.setTinggi(5);
        System.out.println("Subclass Balok");
        System.out.println("Panjang : " + b.getPanjang());
        System.out.println("Lebar : " + b.getLebar());
        System.out.println("Tinggi : " + b.getTinggi());
        System.out.println("Volume : " + b.Volume());
    }
}