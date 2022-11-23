
public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(500, 90,"");
        Magic magic = new Magic(460, 75,"");
        Medic medic = new Medic(450, 0, "");
        Hero[] heroes={ warrior,magic,medic};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}
