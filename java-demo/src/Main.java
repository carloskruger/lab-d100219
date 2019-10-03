public class Main {

    public static void main(String[] args) {

        //Instantiate new Animal
        Animal animal = new Animal(4,25,true,"Elephant");



        String name;

        int topSpeed;

        //get name and speed values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed();

        //Print some output

       animal.printNameAndTopSpeed();

        //Set new name, speed, and endangered properties values using setters

        animal.setName("Lion");
        animal.setTopSpeed(50);


        //get new values using getters

        name = animal.getName() ;
        topSpeed = animal.getTopSpeed();

        //Print some output

        animal.printNameAndTopSpeed();



    }
}
