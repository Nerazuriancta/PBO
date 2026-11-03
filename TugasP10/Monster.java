package TugasP10;

public abstract class Monster implements Damageable {
    protected int health;
    protected int level;

    public Monster(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public abstract void heal();

    @Override 
    public abstract void damaged();

    public String getMonsterInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}