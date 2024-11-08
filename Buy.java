public class Buy extends Item implements Borrowable{
    private String borrower;

    public Buy(String title,String id){
        super(title,id);
        this.borrower= null;
    }
        @Override
        public void borrowItem(String borrower) {
        System.out.println(getTitle()+" has been borrowed by"+ borrower);
    }
        @Override
        public void isBorrowed() {
        if(borrower != null) {
            System.out.println(" the book is already borrowed by:"+ borrower);
        } else {
            System.out.println(" the book is not borrowed");
        }
    }
        }
    