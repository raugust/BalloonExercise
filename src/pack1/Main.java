package pack1;

public class Main {

    public static void main(String[] args) {
        // Create an array of balloons
        Balloon[] thing = new Balloon[500];
        //build the first balloon
        thing[0] = new Balloon();
        System.out.println(thing[0]);
        //build the second balloon
        thing[Balloon.getQuantity()] = new Balloon(12, "white");
        //build the third balloon
        thing[Balloon.getQuantity()] = new Balloon(6, "yellow");
        //print the number of balloons made today
        System.out.printf("Number of balloons made = %d%n", Balloon.getQuantity());
        //Destruct the balloon
        Balloon.destruct(1, thing);
        //print the number of balloons remaining
        System.out.printf("Number of balloons made = %d%n", Balloon.getQuantity());
        //Show the Balloons' characteristics
        //each is the pointer
        for (Balloon each : thing) {
            //only shows the object if it is defined
            if (each != null) System.out.println(each);
        }
    }
}

class Balloon {
    //properties
    //private means encapsulated (can't be changed outside of class)
    private int size;
    private String color;
    private boolean inflated;
    private static int quantity = 0;

    //Default Constructor
    Balloon() {
        size = 10;
        color = "blue";
        inflated = false;
        quantity++;
    }

    //Custom Constructor
    Balloon(int newSize, String newColor) {
        size = newSize;
        color = newColor;
        inflated = false;
        quantity++;
    }

    //Return color of the object
    String getColor() { return color; }

    //Return size of the object
    int getSize() { return size; }

    //Return quantity of balloons made
    static int getQuantity() { return quantity; }

    //Destruct a balloon
    static void destruct(int element, Balloon[] array1) {
        array1[element] = null;
        quantity--;
    }

    // Went to Code/Generate/toString and selected size and color
    @Override
    public String toString() {
        return "Balloon {" +
                "size = " + size +
                ", color = " + color +
                ", " + (inflated ? "inflated" : "not inflated") +
                '}';
    }

    public void setInflated(boolean arg) { inflated = arg; }

    public boolean isInflated() { return inflated; }
}
