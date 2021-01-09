public class KumasFabrikasi implements IFabrika {
    @Override
    public IKumas fabrikaMetodu(String urun) {
        switch (urun) {
            case "keten":
                return new KetenKumas();
            case "kadife":
                return new KadifeKumas();
            default:
                return new KadifeKumas();
        }
    }
}