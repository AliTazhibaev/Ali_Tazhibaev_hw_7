public abstract class Hero {
    private int health;
    private int damage;
    String ability;

    public Hero(int health, int damage, String ability) {

        this.health = health;
        this.damage = damage;
        this.ability = ability;
    }

    public abstract void applySuperAbility();
}
