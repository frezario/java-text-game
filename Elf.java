package lotr;

public class Elf extends Character {
    public Elf() {
        this.power = 10;
        this.hp = 10;
    }

    @Override
    public void kick(Character c) {
        if (this.power > c.power) {
            c.setHp(0);
            return;
        }
        this.hp--;
    }
}
