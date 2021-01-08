public class MediaPlayer implements Runnable{
    private Channel channel;
    private boolean control = true;
    private static MediaPlayer mediaPlayer;

    private MediaPlayer()
    {
        //mediaPlayer = new MediaPlayer();
    }

    public static MediaPlayer getInstance()
    {
        if(mediaPlayer == null)
        {
            mediaPlayer = new MediaPlayer();
        }
        return mediaPlayer;
    }

    public void chooseChannel(Channel channel)
    {
        this.channel = channel;
    }

    public void play()
    {
        control = true;
        new Thread(this).start();
    }

    public void stop()
    {
        control = false;
    }

    @Override
    public void run() {
        while(control)
        {
            Main._sleep(2000);
            System.out.println(channel.getName() + " channel is playing on "
                    + channel.getLink() + " link");
        }

    }
}
