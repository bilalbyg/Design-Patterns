public class DiskYedekleyici implements IYedekleyici{
    @Override
    public void kaydet(String kaynakKlasorKonumu, String hedefKlasorKonumu) {
        System.out.println(kaynakKlasorKonumu + " konumundan "
                + hedefKlasorKonumu + " konumuna yedeklenmiştir.");
    }
}
