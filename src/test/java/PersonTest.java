import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class PersonTest {

    @Test
    void getName() {
        //arrange
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        //act
        String name = Henk.getName();
        //assert
        assertEquals("Henk", name);
    }

    @Test
    void setName() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Henk.setName("Jan");
        assertEquals("Jan", Henk.getName());
    }

    @Test
    void getMiddleName() {
        Person Henk = new Person("Henk", "Test", "Wijsneus", 16, "Weet hij niet");
        assertEquals("Test", Henk.getMiddleName());
    }

    @Test
    void setMiddleName() {
        Person Henk = new Person("Henk", "Test", "Wijsneus", 16, "Weet hij niet");
        Henk.setMiddleName("Willem");
        assertEquals("Willem", Henk.getMiddleName());
    }

    @Test
    void getLastName() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        assertEquals("Wijsneus", Henk.getLastName());
    }

    @Test
    void setLastName() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Henk.setLastName("Wijs");
        assertEquals("Wijs", Henk.getLastName());
    }

    @Test
    void getSex() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        assertEquals("Weet hij niet", Henk.getSex());
    }

    @Test
    void setSex() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Henk.setSex("Man");
        assertEquals("Man", Henk.getSex());
    }

    @Test
    void getAge() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        assertEquals(16, Henk.getAge());
    }

    @Test
    void setAge() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Henk.setAge(20);
        assertEquals(20, Henk.getAge());
    }

    @Test
    void getFather() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Person Jan = new Person("Jan", "Wijsneus", 56, "man");
        Person Els = new Person("Els", "Wijsneus", 54, "vrouw");
        Henk.addParents(Jan,Els);
        assertEquals(Jan, Henk.getFather());
    }

    @Test
    void getMother() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Person Jan = new Person("Jan", "Wijsneus", 56, "man");
        Person Els = new Person("Els", "Wijsneus", 54, "vrouw");
        Henk.addParents(Jan,Els);
        assertEquals(Els, Henk.getMother());
    }

    @Test
    void addParents() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Person Jan = new Person("Jan", "Wijsneus", 56, "man");
        Person Els = new Person("Els", "Wijsneus", 54, "vrouw");
        Henk.addParents(Jan,Els);
        assertEquals(Jan, Henk.getFather());
        assertEquals(Els, Henk.getMother());
    }

    @Test
    void getChildren() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Person Els = new Person("Els", "Wijsneus", 54, "vrouw");
        Henk.addChildren(Els);
        assertArrayEquals(new Person[]{Els}, Henk.getChildren().toArray());
    }

    @Test
    void addChildren() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Person Jan = new Person("Jan", "Wijsneus", 56, "man");
        Person Els = new Person("Els", "Wijsneus", 54, "vrouw");
        Henk.addChildren(Jan);
        Henk.addChildren(Els);
        assertEquals(2, Henk.getChildren().size());
    }

    @Test
    void getPets() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Pet Jack = new Pet("Russel", 5, "Dog");
        Henk.addPet(Jack);
        assertArrayEquals(new Pet[]{Jack}, Henk.getPets().toArray());
    }

    @Test
    void addPet() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Pet Jack = new Pet("Russel", 5, "Dog");
        Henk.addPet(Jack);
        assertEquals(Jack, Henk.getPets().get(0));
    }

    @Test
    void getSiblings() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Person Jan = new Person("Jan", "Wijsneus", 56, "man");
        Person Els = new Person("Els", "Wijsneus", 54, "vrouw");
        Henk.addSibling(Jan);
        Henk.addSibling(Els);
        assertArrayEquals(new Person[]{Jan, Els}, Henk.getSiblings().toArray());
    }

    @Test
    void addSibling() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Person Jan = new Person("Jan", "Wijsneus", 56, "man");
        Person Els = new Person("Els", "Wijsneus", 54, "vrouw");
        Henk.addSibling(Jan);
        Henk.addSibling(Els);
        assertEquals(2, Henk.getSiblings().size());
    }

    @Test
    void getGrandChildren() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Person Jan = new Person("Jan", "Wijsneus", 56, "man");
        Person Els = new Person("Els", "Wijsneus", 54, "vrouw");
        Person Piet = new Person("Piet","Wijsneus", 1, "man");
        Person Truus = new Person("Truus","Wijsneus" , 1, "vrouw");
        Henk.addParents(Jan,Els);
        Henk.addChildren(Piet);
        Henk.addChildren(Truus);
        assertArrayEquals(new Person[]{Piet, Truus}, Jan.getGrandChildren().toArray());
        assertArrayEquals(new Person[]{}, Henk.getGrandChildren().toArray());
        assertArrayEquals(new Person[]{}, Truus.getGrandChildren().toArray());
    }

    @Test
    void testToString() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        assertEquals("Henk", Henk.toString());
    }
}