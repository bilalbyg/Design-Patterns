public class BulutYedekleyici{
    public void bulutaKaydet(String kaynakKlasorKonumu,String hedefKlasorKonumu)
    {
        baglantiKur(hedefKlasorKonumu);
        dosyaGonder(kaynakKlasorKonumu);
        baglantiyiKapat();
    }

    private void baglantiKur(String hedefAdres)
    {
        System.out.println(hedefAdres + " adresi ile baglanti kuruldu.");
    }

    private void dosyaGonder(String kaynak)
    {
        System.out.println("Dosyalar " + kaynak  + " adrese gonderildi.");
    }

    private void baglantiyiKapat()
    {
        System.out.println("Baglanti sonlandirildi.");
    }
}
