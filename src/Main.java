import java.sql.SQLOutput;

public class Main {
    private static final Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
    private static final Person Snowflake = new Person("Snow", "Flake", "Storm", 28, "Maiskolf");
    //Pets
    private static final Pet Jack = new Pet("Russel", 5, "Dog");
    private static final Pet German = new Pet("Sheppard", 2, "Dog");

    //Parents
    private static final Person Jan = new Person("Jan", "Wijsneus", 56, "man");
    private static final Person Els = new Person("Els", "Wijsneus", 54, "vrouw");
    //Child + Sibling
    private static final Person Druppel = new Person("Druppel", "Storm", 14, "vrouw");
    private static final Person GrasSpriet = new Person("Gras","Spriet" , "Storm", 4, "vrouw");
    private static final Person Piet = new Person("Piet","Wijsneus", 1, "man");
    private static final Person Truus = new Person("Truus","Wijsneus" , 1, "vrouw");

    public static void main(String[] args) {
        Henk.addParents(Jan,Els);
        Henk.addChildren(Piet);
        Henk.addChildren(Truus);
        System.out.println(Henk.getName() + "'s vader is: " + Henk.getFather().getName());
        System.out.println(Henk.getName() + "'s moeder is: " + Henk.getMother().getName());

        Snowflake.addParents(Jan,Els);
        Snowflake.addSibling(Druppel);
        Snowflake.addChildren(GrasSpriet);
        System.out.println(Snowflake.getName() + " has " + Snowflake.getSiblings().size() + " sibling's");

        System.out.println(Jan.getGrandChildren());
        System.out.println(Snowflake.getGrandChildren());


        //pets
        Henk.addPet(Jack);
        Henk.addPet(German);
        System.out.println(Henk.getPets());
        System.out.println(German.getOwner());

    }

}
