package lotr;

public class King extends Character {
    protected int min_hp = 5;
    protected int min_power = 5;
    protected int range = 10;
    public King() {
        this.hp = (int) (Math.random() * (this.range + 1) + this.min_hp);
        this.power = this.min_power;
    }

    @Override
    public void kick(Character c) {
        this.power = (int) (Math.random() * (this.range + 1) + this.min_power);
        c.setHp(c.hp - this.power);
    }
}
