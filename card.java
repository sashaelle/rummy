public class card
{
    //declares the instance fields and sets back as a new ImageIcon
    private String name;

    //declares value
    public int value;

    /**
     * this is the constructor to set the instance fields
     * @param nam - the name of the card
     * @param val - the value of the card
     */
    public card(String nam, int val) {
        name = nam;
        value = val;
    }

    /**
     * get method for name
     * @return - the name of the card
     */
    public String getName() {
        return name;
    }

    /**
     * get method for value
     * @return - returns the value of the card
     */
    public int getValue() {
        return value;
    }
}