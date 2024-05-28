class Example <E> {
    //instance Variable
    E i;

    // Setter for number
    public void setI(E il) {
        i = il;
    }

    // Getter for number
    public E getI() {
        return i;
    }
}


public class Generic {
    public static void main(String[] args) {
        Example <Integer> e = new Example <Integer>();
        Example <String>  e1 = new Example <String>();

        // Create an Integer object
        Integer i2 = new Integer(10);
        String s = new String("Java");

        // Use the setter to set the value
        e.setI(i2);
        e1.setI(s);

        // Use the getter to retrieve the value
        System.out.println(e.getI());
        System.out.println(e1.getI());


    }
}

//Setting Generic Classes in Java.