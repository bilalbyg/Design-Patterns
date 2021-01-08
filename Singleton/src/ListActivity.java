import java.util.ArrayList;

public class ListActivity implements Activity{
    private ArrayList<Channel> channelList;
    @Override
    public void onCreate() {
        channelList = channelListFromDB();
    }

    public ArrayList<Channel> channelListFromDB()
    {
       return Database.getInstance().getChannelListFromDB();
    }

    public Channel chooseChannel(int index)
    {
        return channelList.get(index);
    }
}
