public class Item {
    public String title;
    public String id;

    public Item(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Title: " + title);
    }
}

