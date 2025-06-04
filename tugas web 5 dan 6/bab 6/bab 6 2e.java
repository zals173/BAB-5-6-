Public class lagu {
    private string band;
    private string judul;
    public void IsiParam (string judul, string band) {
        this.judul = judul;
        this.band = band;
    }
public void cetakKeLayar(){
    if (judul==null && band==null) return;
system.out.println("judul : "+judul+"\nband:"+pencipta);
    }
}
public class DemoLagu {
    public static void main (string[]args) {
        lagu song=new lagu();
        song.IsiParam("dance beside","all american reject");
        song.cetakKeLayar();
    }
}