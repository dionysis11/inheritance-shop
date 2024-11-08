public class Movie extends item implements Borrowable{
    private String borrower;
    public Movie(String title, String id) {
        super(title, id);
        this.borrower = null;
    }
    @Override
    public void borrowItem(String borrower) {
        System.out.println(getTitle() + "has been borrowed by: "  borrower);
    }
    @Override
    public void isBorrowed() {
        if (borrower != null){
            System.out.println("The book is already borrowed by: " + borrower);
        } else {
            System.out.println(x:"the book is not borrowed: ");
        }
    }
} 