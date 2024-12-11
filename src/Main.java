import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // 1. Create an ArrayList to store names of students.
        // 2. Add at least five names to the list.
        // 3. Print the list of names
        String [] names = {"John Doe", "Jane Doe", "Paul Smith", "Ted Baker", "Dog Man"};
        HandsOnArrayList testObj = new HandsOnArrayList(names);
        System.out.println("List of names:");
        testObj.printList();

        // 4. Remove a name and print the updated list.
        testObj.removeName("C");
        System.out.println("\nUpdated list after removing a name");
        testObj.printList();

        // 5. Sort the list alphabetically and print the sorted list
        testObj.sortList();
        System.out.println("\nSorted list");
        testObj.printList();


    }
}
