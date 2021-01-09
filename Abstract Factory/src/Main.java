public class Main {
    public static void main(String[] args)
    {
        IFabrika fabrika = new AhsapKadifeFab();
        InterClient interClient = new InterClient(fabrika);
        interClient.calistir();
    }
}
