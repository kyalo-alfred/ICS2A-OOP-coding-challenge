import java.util.Random;

public class dice {
    public static void main(String[] args) {
        // Dice Roll Game
        Random dice = new Random();
        int roll1 = dice.nextInt(6) + 1;
        int roll2 = dice.nextInt(6) + 1;
        int roll3 = dice.nextInt(6) + 1;
        int total = roll1 + roll2 + roll3;

        System.out.printf("Dice roll: %d + %d + %d = %d%n", roll1, roll2, roll3, total);

        // Check for triples or doubles
        if (roll1 == roll2 && roll2 == roll3) {
            System.out.println("You rolled triples! +6 bonus to total!");
            total += 6;
        }
        else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
            System.out.println("You rolled doubles! +2 bonus to total!");
            total += 2;
        }

        // Determine win or lose
        if (total >= 15) {
            System.out.println("You win!");
        }
        else {
            System.out.println("Sorry, you lose.");
        }

        // Subscription Expiration Logic
        Random random = new Random();
        int daysUntilExpiration = random.nextInt(12);
        int discountPercentage = 0;

        System.out.printf("%nDays until expiration: %d%n", daysUntilExpiration);

        if (daysUntilExpiration < 1) {
            System.out.println("Your subscription has expired!");
        }
        else if (daysUntilExpiration == 1) {
            discountPercentage = 20;
            System.out.println("Your subscription expires within a day!");
            System.out.printf("Renew now and save %d%%!%n", discountPercentage);
        }
        else if (daysUntilExpiration <= 5) {
            discountPercentage = 10;
            System.out.printf("Your subscription expires in: %d days.%n", daysUntilExpiration);
            System.out.printf("Renew now and save %d%%!%n", discountPercentage);
        }
        else if (daysUntilExpiration <= 10) {
            System.out.printf("Your subscription expires in: %d days.%n", daysUntilExpiration);
            System.out.println("Your subscription will expire soon. Renew now!");
        }
    }
}
