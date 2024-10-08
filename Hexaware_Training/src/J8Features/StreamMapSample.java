package J8Features;

import java.util.*;
import java.util.stream.*;

class StreamMapSample {

 public static void main(String[] args)
 {

     // Creating an integer Arraylist to store marks
     ArrayList<Integer> marks = new ArrayList<Integer>();

     marks.add(30);
     marks.add(78);
     marks.add(26);
     marks.add(96);
     marks.add(79);

     // Printing the marks of the students before grace
     System.out.println(
         "Marks of students before grace : " + marks);

     List<Integer> updatedMarks
         = marks.stream()
               .map(i -> i + 6)
               .collect(Collectors.toList());

     // Printing the marks of the students after grace
     System.out.println(
         "Marks of students  after grace : "
         + updatedMarks);
 }
}
