package ChessBoard;

 class ChessBoard {
    private int height;
    private int weight;

    public ChessBoard(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void printBoard() {

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= weight; j++) {
                if (i % 2 == 0) {
                    System.out.print(" ");
                    System.out.print("*");
                } else {
                    System.out.print("*");
                    System.out.print(" ");
                }
                if (j == weight) {
                    System.out.println();
                }
            }
        }
    }
}
