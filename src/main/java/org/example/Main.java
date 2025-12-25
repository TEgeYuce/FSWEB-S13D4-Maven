package org.example;

public class Main {
    public static void main(String[] args) {

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());




        Player player = new Player("ege", 100, Weapon.MACE);
        System.out.println("Health remaining: " + player.healthRemaining());

        Player player2 = new Player("xyz", 90, Weapon.AXE);
        System.out.println("Health remaining: " + player2.healthRemaining());

        player.loseHealth((int) (player2.getWeapon().getDamage() * player2.getWeapon().getAttackSpeed()));
        System.out.println("Health remaining after damage: " + player.healthRemaining());

        player.restoreHealth(70);
        System.out.println("Health remaining after restore: " + player.healthRemaining());


    }
}