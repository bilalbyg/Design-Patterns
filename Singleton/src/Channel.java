public class Channel {
    private String link;
    private String name;

    public Channel(String link, String name) {
        setLink(link);
        setName(name);
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
