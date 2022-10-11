package lotr;

public class CharacterFactory {
    public static Character createCharacter() {
        int num = (int) (Math.random() * 5);
        return num == 0 ? new Elf() : num == 1 ? new Hobbit() : num == 2 ? new King() : new Knight();
    }
}
