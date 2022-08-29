public class Weapon {
    // Enemy attributes
    String name;
    int damage;
    double weight;
    String rarity;
    String description;

    // Enemy method
    public void weaponDescription() {
        System.out.println("My weapon is " + name + ", it deals " + damage +" damage, it weighs about " + weight + " kilos and its rarity is " + rarity + ".");
    }
}