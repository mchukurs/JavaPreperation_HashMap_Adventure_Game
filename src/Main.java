import com.chukurs.AdventureGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myLocation = """
                lake,at the edge of Lake Matiss,E:ocean,W:forest,S:well,N:cave
                ocean,on Matiss beach before an angry sea,W:lake
                cave,at the mouth of Matiss bat cave,E:ocean,W:forest,S:lake
                """;
        AdventureGame game = new AdventureGame(myLocation);
        game.play("lake");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String direction = scanner.nextLine().trim().toUpperCase().substring(0, 1);
            if (direction.equals("Q")) {
                break;
            }
            game.move(direction);
        }
    }
}