package lotr;

public abstract class Character {
    protected int power;
    protected int hp;

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void setPower(int power) {
        this.power = Math.max(power, 0);
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public abstract void kick(Character c);

    public boolean isAlive() {
        return hp > 0;
    }

    @Override
    public String toString(){
        return this.getClass().getName() +
                "{hp=" + this.hp + ", power=" + this.power + "}";
    }
}

