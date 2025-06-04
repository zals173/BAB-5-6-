class luar {
    private int a;
    
    public void setA(int nilai) {
        a = nilai;
    }
    
    public int getA() {
        return a;
    }

    // mendefinisikan inner class
    class dalam {
        private int x = 10; // hanya dikenali oleh kelas Dalam
        
        public void showData() {
            System.out.println("Nilai a dari kelas Luar : " + a);
            System.out.println("Nilai x dari kelas Dalam : " + x);
        }
    }

    public void showData() {
        // Baris dibawah ini SALAH, karena x tidak dikenali disini
        // System.out.println("Nilai x dari kelas Dalam : " + x);
        
        dalam obj = new dalam();
        obj.showData();
    }
}

class DemoInnerClass {
    public static void main(String[] args) {
        Luar obj1 = new Luar();
        // Dalam obj2 = new Dalam(); // SALAH
        obj1.setA(5);
        obj1.showData();
    }
}