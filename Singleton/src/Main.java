import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        MainActivity mainActivity = new MainActivity();
        ListActivity listActivity = new ListActivity();
        Channel channel;
        mainActivity.onCreate();
        listActivity.onCreate();
        channel = listActivity.chooseChannel(0);
        mainActivity.play(channel);

        Main._sleep(4000);

        listActivity.onCreate();
        channel = listActivity.chooseChannel(1);
        mainActivity.onCreate();
        mainActivity.stop();
        mainActivity.play(channel);
        mainActivity.stop();

    }

    public static void _sleep(int time)
    {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
