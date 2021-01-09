public class InterClient {
    private IIskelet iskelet;
    private IKumas kumas;

    public InterClient(IFabrika fab)
    {
        kumas = fab.kumasGetir();
        iskelet = fab.iskeletGetir();
    }

    public void calistir()
    {
        String i = iskelet.iskeletUret();
        String k = kumas.kumasUret();
        System.out.println("Mobilya " + i + " ve " + k +  " uretildi.");
    }
}
