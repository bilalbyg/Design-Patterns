public class AhsapKetenFab implements IFabrika{
    @Override
    public IKumas kumasGetir() {
        return new KetenKumas();
    }

    @Override
    public IIskelet iskeletGetir() {
        return new AhsapIskelet();
    }
}
