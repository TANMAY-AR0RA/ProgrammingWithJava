public class Book {
    private int noOfCopies;
    Book(int noOfCopies){   //Constructor has the same name as the class but does not have a return type.
        this.noOfCopies = noOfCopies;
    }
    public int getNoOfCopies() {
        return noOfCopies;
    }
    public void setNoOfCopies(int noOfCopies) {
        if(noOfCopies > 0)
            this.noOfCopies = noOfCopies;
    }
    public void increaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.noOfCopies + howMuch);
    }
    public void decreaseNoOfCopies(int howMuch) {
        setNoOfCopies(this.noOfCopies - howMuch);
    }
}
