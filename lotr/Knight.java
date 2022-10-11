package lotr;

public class Knight extends Character {
    protected int min_hp = 2;
    protected int min_power = 2;
    protected int range = 10;

    public Knight() {
        this.hp = (int) (Math.random() * (this.range + 1) + this.min_hp);
        this.power = this.min_power;
    }

    @Override
    public void kick(Character c) {
        this.power = (int) (Math.random() * (this.range + 1) + this.min_power);
        c.setHp(c.hp - this.power);
    }
}
