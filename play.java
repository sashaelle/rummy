import java.util.*;

public class play {
    private static ArrayList<card> u1;
    private static final cards cards = new cards();
    public static ArrayList<card> dis = new ArrayList<>();

    private static final Scanner input = new Scanner(System.in);

    static void menu() {
        System.out.println("""
                1. See your cards.
                2. See discarded card.
                3. Draw top card.
                """);

        int choice = input.nextInt();

        switch (choice) { //lowkey I've never done switch case without a do-while
            case 1:
                showCards(); menu();
                break;
            case 2:
                discardTop();
                break;
            case 3:
                drawCard();
                break;
            default:
                System.out.println("Just choose goddamit");
        }
    }

    play(ArrayList<card> user, ArrayList<card> discard){
        u1 = user;
        dis = discard;
    }

    static void drawCard(){
        System.out.println("You drew: " + cards.shuf.get(0).getName());
        u1.add(cards.shuf.remove(0));
        discard(u1.get(u1.size() - 1));
    }

    static void discardTop(){
        System.out.print("Current Discarded Card: ");
        System.out.println(dis.get(0).getName()); //smorp

        System.out.println("You want it or no? y/n");
        String choice = input.next();

        if(choice.equalsIgnoreCase("y")) {
            System.out.println("You drew: " + dis.get(0).getName());
            u1.add(dis.remove(0));
            discard(u1.get(u1.size() - 1));
        } else if (choice.equalsIgnoreCase("n")) {
            menu();
        } else {
            System.out.println("Tf did you input? Put in y or n. It's not that hard");
            discardTop();
        }
    }

    //this isn't finished but my brain said we're fried
    static void discard(card recent){
        System.out.print("Well since you drew a card, get rid of one." +
                "\nWhich card we tossing? ");
        showCards();
        String choice = input.next();
        for (card car : u1) {
            String currentCard = car.getName();
            if (choice.equalsIgnoreCase(recent.getName())) {
                System.out.println("No. You just got that card. Do you have the memory of a goldfish?");
                discard(u1.get(u1.size() - 1));
            } else if (choice.equalsIgnoreCase(currentCard)) {
                u1.remove(car); return;
            }
        }
        System.out.println("\nYeah you don't have that card dumbass");
        discard(u1.get(u1.size() - 1));
    }

    static void showCards(){
        System.out.print("Your Cards: ");
        for (card card : u1) {
            System.out.print(card.getName() + " ");
        }
        System.out.println();

    }
}
