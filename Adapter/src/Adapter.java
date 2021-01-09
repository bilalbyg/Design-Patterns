public class Adapter implements IYedekleyici{
    private BulutYedekleyici bulutYedekleyici;
    @Override
    public void kaydet(String kaynakKlasorKonumu, String hedefKlasörKonumu) {
        bulutYedekleyici = new BulutYedekleyici();
        bulutYedekleyici.bulutaKaydet(kaynakKlasorKonumu,hedefKlasörKonumu);
    }
}
