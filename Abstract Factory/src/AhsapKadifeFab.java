public class AhsapKadifeFab implements IFabrika{
    @Override
    public IKumas kumasGetir() {
        return new KadifeKumas();
    }

    @Override
    public IIskelet iskeletGetir() {
        return new AhsapIskelet();
    }
}
