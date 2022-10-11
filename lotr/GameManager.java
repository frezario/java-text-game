package lotr;
import lotr.CharacterFactory;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("Let the battle begin!");
        System.out.println("Player1: " + c1.toString());
        System.out.println("Player2: " + c2.toString());
        int turn = 0;
        while (c1.isAlive() && c2.isAlive() && turn < 1000) {
            if (turn % 2 == 0) {
                System.out.println("Player1(" + c1.getClass().getSimpleName() + ") hits Player2!");
                c1.kick(c2);
                System.out.println("Player2(" + c2.getClass().getSimpleName() + ") has " + c2.hp + " health-points");
            }
            else {
                System.out.println("Player2(" + c2.getClass().getSimpleName() + ") hits Player1!");
                c2.kick(c1);
                System.out.println("Player1(" + c1.getClass().getSimpleName() + ") has " + c1.hp + " health-points");
            }
            turn++;
        }

        if (turn == 1000) {
            System.out.println("The game is endless...");
        }

        if (turn == 1) {
            System.out.println("Player2 has won!");
        }
        else {
            System.out.println("Player1 has won!");
        }
    }

    public static void main(String[] args) {
        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        fight(c1, c2);
    }
}
