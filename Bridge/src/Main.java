public class Main {
    public static void main(String[] args)
    {
        IColor c = new DarkTheme();
        UserInterface ui = new WindowsUI(c);
        ui.createUI();
        System.out.println("------------------------");
        c = new LightTheme();
        ui = new LinuxUI(c);
        ui.createUI();
        System.out.println("------------------------");
        c = new BlueTheme();
        ui = new WindowsUI(c);
        ui.createUI();
    }
}
