public abstract class Item {
    private String title;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    Item() {
        title = "";
    }

    Item(String title) {
        this.title = title;
    }

     abstract String getListing();

    @Override
    public String toString() {
        return title;
    }
}
