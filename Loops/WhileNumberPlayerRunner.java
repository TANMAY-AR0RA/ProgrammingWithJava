public class WhileNumberPlayerRunner {
    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer(30);

        player.printSquaresUptoLimit();
        // For limit 40, output will be: 1 4 9 16 25 36

        player.printCubesUptoLimit();
        // For limit 40, output will be: 1 8 27
    }
}
