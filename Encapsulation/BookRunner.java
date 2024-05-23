public class BookRunner {
    public static void main(String[] args) {
        Book javaProgramming = new Book();
        javaProgramming.setNoOfCopies(100);
        System.out.println(javaProgramming.getNoOfCopies());

        javaProgramming.increaseNoOfCopies(50);
        System.out.printf("No of copies after increasing = %d",javaProgramming.getNoOfCopies());
        System.out.println();
        javaProgramming.decreaseNoOfCopies(10);
        System.out.printf("No of copies after decreasing = %d",javaProgramming.getNoOfCopies());
    }
}
