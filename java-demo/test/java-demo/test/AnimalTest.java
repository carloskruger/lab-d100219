import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {



    @Test
    public void testNameIsCorrect() {
        Animal animal = new Animal(4,25,true,"Elephant");

        String expected = "Elephant";
        String actual = animal.getName();

        assertEquals(expected, actual);
    }
    @Test
    public void testTopSpeedIsCorrect() {
        Animal animal = new Animal(4,25,true,"Elephant");

        int expected = 25;
        int actual = animal.getTopSpeed();

        assertEquals(expected, actual);
    }

    @Test
    public void testIsEndangeredIsCorrect() {
        Animal animal = new Animal(4,25,true,"Elephant");

        boolean expected = true;
        boolean actual = animal.isEndangered();

        assertEquals(expected, actual);
    }

    @Test
    public void testgetNumLegs() {
        Animal animal = new Animal(4,25,true,"Elephant");

        int expected = 4;
        int actual = animal.getNumLegs();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetNumLegs() {
        Animal animal = new Animal();
        animal.setNumLegs(4);
        int expected = 4;
        int actual = animal.getNumLegs();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetIsEndangered() {
        Animal animal = new Animal();
        animal.setEndangered(true);
        boolean expected = true;
        boolean actual = animal.isEndangered();
        assertEquals(expected, actual);
    }


    @Test
    public void testSetTopSpeed() {
        Animal animal = new Animal();
        animal.setTopSpeed(150);
        int expected = 150;
        int actual = animal.getTopSpeed();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
        Animal animal = new Animal();
        animal.setName("Gorilla");
        String expected = "Gorilla";
        String actual = animal.getName();
        assertEquals(expected, actual);
    }


}

