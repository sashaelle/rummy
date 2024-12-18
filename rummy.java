/*
* Main driver and game
*/

import java.util.*;

public class rummy {
    private static final cards cards = new cards();
    private static final Scanner input = new Scanner(System.in); //i don't remember how this works

    public static ArrayList<card> u1 = new ArrayList<>();
    public static ArrayList<card> c1 = new ArrayList<>();
    public static ArrayList<card> dis = new ArrayList<>();

    public static void main(String[] args){
        new rummy();
    }

    public rummy(){
        System.out.println("Welcome to Rummy\nHere are your cards");
        deal();
        startGame();
    }

    public void deal() {
        for (int i = 0; i < 10; i++) {
            // removes cards from the top of the deck and distributes each card to the users
            // one by one
            // removes card from deck and adds to the users hands simultaneously
            u1.add(cards.shuf.remove(0));
            c1.add(cards.shuf.remove(0));
        }

        // inserts at the 0th element so it is the top of the discard pile
        dis.add(0, cards.shuf.remove(0));

        System.out.print("Comp Cards: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(c1.get(i).getName() + " ");
        }
        new play(u1, dis);
        System.out.println();
    }

    void startGame(){
        while(true){
            System.out.println("\nYour turn: ");
            play.menu();

            if (play.checkWin(u1)){
                System.out.println("You win!");
                break;
            }

            computerTurn();
        }
    }

    void computerTurn(){
        System.out.println("\nComputer's Turn...");
    }
}
