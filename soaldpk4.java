class Game {
    String judul;
    String genre;

    public Game(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }
}

public class soaldpk4 {
    public static void main(String[] args) {
        Game game1 = new Game("Mobile Legends", "MOBA");
        Game game2 = new Game("Stardew Valley", "Simulasi");

        System.out.println("Game 1: " + game1.judul + " - " + game1.genre);
        System.out.println("Game 2: " + game2.judul + " - " + game2.genre);
    }
}