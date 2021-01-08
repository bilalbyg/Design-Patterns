import java.util.ArrayList;

public class Database {
    private static Database database;
    private ArrayList<Channel> channelList;
    private Database() {}

    public static Database getInstance()
    {
        if(database == null)
        {
            database = new Database();
        }
        return database;
    }

    public ArrayList<Channel> getChannelListFromDB()
    {
        Channel ch1 = new Channel("www.ch1.com","ch1");
        Channel ch2 = new Channel("www.ch2.com","ch2");
        Channel ch3 = new Channel("www.ch3.com","ch3");
        channelList = new ArrayList<>();
        channelList.add(ch1);
        channelList.add(ch2);
        channelList.add(ch3);
        return channelList;
    }
}
