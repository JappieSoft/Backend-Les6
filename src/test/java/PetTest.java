import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    @Test
    void getName() {
        Pet Jack = new Pet("Russel", 5, "Dog");
        assertEquals("Russel", Jack.getName());
    }

    @Test
    void setName() {
        Pet Jack = new Pet("Russel", 5, "Dog");
        Jack.setName("Jack");
        assertEquals("Jack", Jack.getName());
    }

    @Test
    void getAge() {
        Pet Jack = new Pet("Russel", 5, "Dog");
        assertEquals(5, Jack.getAge());
    }

    @Test
    void setAge() {
        Pet Jack = new Pet("Russel", 5, "Dog");
        Jack.setAge(1);
        assertEquals(1, Jack.getAge());
    }

    @Test
    void getSpecies() {
        Pet Jack = new Pet("Russel", 5, "Dog");
        assertEquals("Dog", Jack.getSpecies());
    }

    @Test
    void setSpecies() {
        Pet Jack = new Pet("Russel", 5, "Dog");
        Jack.setSpecies("Cat");
        assertEquals("Cat", Jack.getSpecies());
    }

    @Test
    void getOwner() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Pet Jack = new Pet("Russel", 5, "Dog");
        Henk.addPet(Jack);
        assertEquals(Henk, Jack.getOwner());
    }

    @Test
    void setOwner() {
        Person Henk = new Person("Henk", "Wijsneus", 16, "Weet hij niet");
        Pet Jack = new Pet("Russel", 5, "Dog");
        Henk.addPet(Jack);
        assertEquals(Henk, Jack.getOwner());
    }

    @Test
    void testToString() {
        Pet Jack = new Pet("Russel", 5, "Dog");
        assertEquals("Russel", Jack.toString());
    }
}