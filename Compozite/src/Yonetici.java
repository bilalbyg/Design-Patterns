public class Yonetici implements ICalisan{
    private int kurumId;
    private String isim;
    private String yoneticiBilgi;

    public Yonetici(int kurumId, String isim) {
        setKurumId(kurumId);
        setIsim(isim);
    }

    public int getKurumId() {
        return kurumId;
    }

    public void setKurumId(int kurumId) {
        this.kurumId = kurumId;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYoneticiBilgi() {
        return yoneticiBilgi;
    }

    public void setYoneticiBilgi(String yoneticiBilgi) {
        this.yoneticiBilgi = yoneticiBilgi;
    }

    public void yonet()
    {
        System.out.println(getYoneticiBilgi() + " - " + getIsim());
    }

    @Override
    public void bilgiGonder() {
        System.out.println(getIsim() + " - " + getKurumId());
    }
}
