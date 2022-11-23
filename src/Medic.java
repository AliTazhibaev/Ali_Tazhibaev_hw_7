public class Medic extends Hero {
    public Medic(int health, int damage, String ability) {
        super(health, damage, ability);

    }

    @Override
    public void applySuperAbility() {
        System.out.println("Медик вылечил воина ");
    }


}
