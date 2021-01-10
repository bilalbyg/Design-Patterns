public class LinuxUI extends UserInterface{
    IColor color;
    public LinuxUI(IColor clr)
    {
        color = clr;
    }
    @Override
    public void createUI() {
        String colorParam = color.createColor();
        System.out.println("LinuxUI created with color " + colorParam);
    }
}
