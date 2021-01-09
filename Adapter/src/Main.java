public class Main {
    public static void main(String[] args)
    {
        String kaynak = "a3s2akajsg1j2g3kjkjg1";

        IYedekleyici yedekleyici;
        yedekleyici = new DiskYedekleyici();
        yedekleyici.kaydet(kaynak,"D://");

        yedekleyici = new USBYedekleyici();
        yedekleyici.kaydet(kaynak,"F://");

        yedekleyici = new Adapter();
        yedekleyici.kaydet(kaynak,"cloud.target.123");
    }
}
