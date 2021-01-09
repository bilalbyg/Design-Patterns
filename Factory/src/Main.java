public class Main {
    public static void main(String[] args)
    {
        String uretilenKumas;
        IFabrika kumasf = new KumasFabrikasi();

        IKumas kumas = kumasf.fabrikaMetodu("keten");
        uretilenKumas = kumas.kumasUret();
        System.out.println(uretilenKumas);

        kumas = kumasf.fabrikaMetodu("kadife");
        uretilenKumas = kumas.kumasUret();
        System.out.println(uretilenKumas);
    }
}
