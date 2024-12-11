import java.util.ArrayList;
import java.util.Collections;
public class HandsOnArrayList {
    ArrayList<String> students = new ArrayList<>();

    public HandsOnArrayList() {
        students.add("E");
        students.add("A");
        students.add("B");
        students.add("C");
        students.add("D");

    }
    public HandsOnArrayList(String [] nameList) {
        Collections.addAll(this.students, nameList);
    }

//    public ArrayList<String> getStudents() {
//        return students;
//    }
//
//    public void setStudents(ArrayList<String> students) {
//        this.students = students;
//    }

    public void printList(){

        for(String name : students){
            System.out.println(name);
        }

    }
    public void removeName(String name){
        boolean removed = students.remove(name);
        if(!removed){
            System.out.println("Name not found");
        }
        else {
            System.out.println(name + " removed");
        }
    }
    public void sortList(){
        Collections.sort(students);

    }
}
