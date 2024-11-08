public class VideoGame extends Item implements Borrowable {
    private String borrower;

    public VideoGame(String title, String id) {
        super(title, id);
        this.borrower = null;
    }

    @Override
    public void borrowItem(String borrower) {
        System.out.println(getTitle() + "has been borrowed by:" + borrower);
    }

    @Override
    public void isBorrowed() {
        if (borrower != null) {
            System.out.println("The VideoGame is already borrowed by: " + borrower);
        } else {
            System.out.println("The book is not borrowed.");
        }
    }
}
