public class Book extends Item implements Borrowable {
    private String borrower;

    public Book(String title, String id) {
        super(title, id);
        this.borrower = null;
    }

    @Override
    public void borrowItem(String borrower) {
        System.out.println(getTitle() + " has been borrowed by " + borrower);
    }

    @Override
    public void isBorrowed() {
        if (borrower != null) {
            System.out.println("The book is already borrowed by: " + borrower);
        } else {
            System.out.println("The book is not borrowed");
        }
         
    }
}
