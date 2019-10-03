
public class Animal {
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;

    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name){
        this.numLegs = numLegs;
        this.topSpeed = topSpeed;
        this.isEndangered = isEndangered;
        this.name = name;
        //Set properties here
    }
    public Animal(){};

    //Put getters and setters here

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public void printNameAndTopSpeed(){
        System.out.println("The "+ this.name + " has a top speed of " + this.topSpeed + " mph.");
    }
}
