public class Speakers extends Item implements Borrowable {
    private String Borrower;

    public Speakers (String title, String id) {
        super(title,id);
        this.Borrower=null;
    }

    @Override
    public void borrowItem(String Borrower){
        System.out.println(getTitle()+"has been borrowed by"+Borrower);
    }

    @Override
    public void isBorrowed() {
        if (Borrower!=null) {
            System.out.println("The speaker is already borrowed by"+ Borrower);

        } else {
            System.out.println("The speaker is not borrowed");
        }
    }



}
