public class MetalKadifeFab implements IFabrika{
    @Override
    public IKumas kumasGetir() {
        return new KadifeKumas();
    }

    @Override
    public IIskelet iskeletGetir() {
        return new MetalIskelet();
    }
}
