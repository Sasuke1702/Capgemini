/*Exercise 4 — Fantasy Game
In a new role-playing fantasy game players must design their character by picking a point value
for each of three characteristics:
• Strength, from 1 to 10
• Health, from 1 to 10
• Luck, from 1 to 10

Write a program that asks for a name for the character and asks for the point value of for each of
the three characteristics. However, the total points must be less than 15. If the total exceeds 15,
then 5 points are assigned to each characteristic
Welcome to Yertle's Quest
Enter the name of your character:
Chortle
Enter strength (1-10):
8
Enter health (1-10):
4
Enter luck (1-10):
6

You have to give your character too many points! Default values have been
assigned:
Chortle, strength: 5, health: 5, luck: 5
(This user interface could get much more complicated. You might want to implement some of
your own ideas.)*/
import java.util.Scanner;
public class FantasyGame
{
    final static int MAX_POINTS = 15;

    public static void main(String[] args) {
        System.out.println("Welcome to Jack Bagbada's Quest");
        String characterName = null;
        int strength = 100;
        int health = 100;
        int luck = 1000;
        Scanner inpScan = new Scanner(System.in);

        System.out.print("Enter the name of your character: ");
        characterName = inpScan.nextLine();
        do
        {
            System.out.print("Enter strength (1-10): ");
            strength = inpScan.nextInt();
        }
        while (strength < 1 || strength > 10);
        do
        {
            System.out.print("Enter health (1-10): ");
            health = inpScan.nextInt();
        }
        while (health < 1 || health > 10);
        do
        {
            System.out.print("Enter luck (1-10): ");
            luck = inpScan.nextInt();
        }
        while (luck < 1 || luck > 10);

        if (strength + health + luck > MAX_POINTS)
        {
            System.out.println("You have give your character too many points! Default values have been assigned:");
            strength = 5;
            health = 5;
            luck = 5;
        }
        inpScan.close();

        System.out.println(characterName + ", strength: " + Integer.toString(strength) + ", health: " + Integer.toString(health) + ", luck: " + Integer.toString(luck));
    }
}
