public class MetalKetenFab implements IFabrika{
    @Override
    public IKumas kumasGetir() {
        return new KetenKumas();
    }

    @Override
    public IIskelet iskeletGetir() {
        return new MetalIskelet();
    }
}
