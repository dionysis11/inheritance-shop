public class Ang extends Item implements Borrowable {
    public String borrower;

    public Ang(String title, String id) {
        super(title,id);
        this.borrower = null;
    }

    @Override
    public void borrowItem(String orrower) {
        System.out.println(getTitle() + " has been borrowed by " + borrower);
    }

    @Override
    public void isBorrowed() {
        if (borrower != null) {
            System.out.println("The Ang is already borrowed by :" + borrower);
        } else {
            System.out.println("The Ang is not borrowed");
        }

    }
}