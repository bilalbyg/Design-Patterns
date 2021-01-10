import java.util.ArrayList;

public class InsanKaynaklari implements ICalisan{
    private ArrayList<ICalisan> calisanlar;

    public InsanKaynaklari()
    {
        calisanlar = new ArrayList<ICalisan>();
    }

    public void calisanEkle(ICalisan calisan)
    {
        calisanlar.add(calisan);
    }

    public void calisanCikar(ICalisan calisan)
    {
        calisanlar.remove(calisan);
    }

    @Override
    public void bilgiGonder() {
        for(ICalisan calisan : calisanlar)
        {
            calisan.bilgiGonder();
        }
    }
}
