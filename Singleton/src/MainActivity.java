public class MainActivity implements Activity{
    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        mediaPlayer = MediaPlayer.getInstance();
    }

    public void play(Channel channel)
    {
        mediaPlayer.chooseChannel(channel);
        mediaPlayer.play();
    }

    public void stop()
    {
        mediaPlayer.stop();
    }
}
