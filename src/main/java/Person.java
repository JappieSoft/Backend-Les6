import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private Person mother;
    private Person father;
    private List<Person> siblings = new ArrayList<Person>();
    private List<Person> children = new ArrayList<Person>();
    private List<Pet> pets = new ArrayList<Pet>();

    public Person(String name, String lastName, int age, String sex) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Person(String name, String middleName, String lastName, int age, String sex) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public void addParents(Person father, Person mother) {
        this.mother = mother;
        this.father = father;
        father.addChildren(this);
        mother.addChildren(this);
    }

    public List<Person> getChildren() {
        return children;
    }

    public void addChildren(Person child) {
        children.add(child);
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        pet.setOwner(this);
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public void addSibling(Person sibling) {
        siblings.add(sibling);
    }

    public List<Person> getGrandChildren() {
        List<Person> grandChildren = new ArrayList<>();

        if (this.getChildren().isEmpty()) {
            System.out.println("Deze persoon heeft geen kinderen.");
        } else {
            for (Person child : this.children) {
                grandChildren.addAll(child.getChildren());
            }
            if (grandChildren.isEmpty()) {
                System.out.println("Deze persoon heeft geen klein-kinderen.");
            }
        }
        return grandChildren;
    }

    @Override
    public String toString() {
        return this.name;
    }
}