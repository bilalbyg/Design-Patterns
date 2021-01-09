public class USBYedekleyici implements IYedekleyici{
    @Override
    public void kaydet(String kaynakKlasorKonumu, String hedefKlasörKonumu) {
        System.out.println(kaynakKlasorKonumu + " konumundan USB bellekteki "
                + hedefKlasörKonumu + " konumuna yedeklenmiştir.");
    }
}
