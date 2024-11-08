public class Song extends Item implements Borrowable {
    private String borrower;
    public Song(String title, String id) {
        super(title, id);
        this.borrower= null;
    }

    @Override
    public void borrowItem(String borrower) {
        System.out.println(getTitle()+ "haw been borrowed by" + borrower);

    }
    @Override
    public void isBorrowed() {
        if (borrower != null) {
            System.out.println("The book is already borrowed by:" + borrower);
            }else{
                System.out.println("the book is not borrowed");
            }
    }
}
