public class Main {
    public static void main(String[] args)
    {
        Tasarimci tasarimci = new Tasarimci(101,"Bilal");
        Tasarimci tasarimci2 = new Tasarimci(102,"Mevlüt");
        InsanKaynaklari tasarimcilar = new InsanKaynaklari();
        tasarimcilar.calisanEkle(tasarimci);
        tasarimcilar.calisanEkle(tasarimci2);

        Gelistirici gelistirici = new Gelistirici(201,"Murat");
        Gelistirici gelistirici2 = new Gelistirici(202,"Ebu");
        InsanKaynaklari gelistiriciler = new InsanKaynaklari();
        gelistiriciler.calisanEkle(gelistirici);
        gelistiriciler.calisanEkle(gelistirici2);

        Yonetici yonetici = new Yonetici(301,"Feride");
        Yonetici yonetici2 = new Yonetici(302,"Irem");
        InsanKaynaklari yoneticiler = new InsanKaynaklari();
        yoneticiler.calisanEkle(yonetici);
        yoneticiler.calisanEkle(yonetici2);

        InsanKaynaklari calisanlar = new InsanKaynaklari();
        calisanlar.calisanEkle(tasarimcilar);
        calisanlar.calisanEkle(gelistiriciler);
        calisanlar.calisanEkle(yoneticiler);
        calisanlar.bilgiGonder();

    }
}
