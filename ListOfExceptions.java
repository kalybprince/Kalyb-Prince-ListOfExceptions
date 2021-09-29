import java.util.ArrayList;

public class ListOfExceptions {
    public static void main(String[] args) {
        // declare and init ArrayList of type object
        ArrayList<Object> myList = new ArrayList<Object>();
        // Add Strings/Integers
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        // Cast values to int where applicable
        for(int i = 0; i < myList.size(); i++) {
            try{
                // Attempt to cast each item as an Integer
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch (ClassCastException e) {
                // raise exception message
                System.out.printf("ERROR : %s\n", e.getMessage());
            }
        }
    }
}