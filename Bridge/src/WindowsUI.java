public class WindowsUI extends UserInterface{
    IColor color;
    public WindowsUI(IColor clr)
    {
         color = clr;
    }

    @Override
    public void createUI() {
        String colorParam = color.createColor();
        System.out.println("WindowsUI created with color " + colorParam);
    }
}
