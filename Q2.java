public class Q2 {
    static class GameEntry {
    public int score;

    public GameEntry(int score) {
        this.score = score;
    }
}


        public static void main(String[] args) {
            GameEntry[] A = new GameEntry[]{
                    new GameEntry(100),
                    new GameEntry(200),
                    new GameEntry(300),
                    new GameEntry(400),
                    new GameEntry(500)
            };

            GameEntry[] B = A.clone();

            A[4].score = 550;

            System.out.println(B[4].score);
        }
    }

