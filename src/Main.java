import javax.swing.text.html.HTMLDocument;

public class Main {
    public static void main(String[] args){
        Boss boss = new Boss();

        boss.setHealth(100);
        boss.setDamage(20);
        boss.setProtectionType("Blocking Attack");
        
        System.out.println("boss information:");
        System.out.println("health: " + boss.getHealth() +
                "\ndamage: " + boss.getDamage() +
                "\nprotectionType: " + boss.getProtectionType());
    }
}