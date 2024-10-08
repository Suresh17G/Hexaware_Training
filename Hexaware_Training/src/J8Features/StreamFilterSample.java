package J8Features;

import java.util.*;
import java.util.stream.*;

class StreamFilterSample {

 public static void main(String[] args)
 {

     // Creating an integer Arraylist to store marks
     ArrayList<Integer> marks = new ArrayList<Integer>();

     marks.add(30);
     marks.add(78);
     marks.add(26);
     marks.add(96);
     marks.add(79);

     System.out.println(
         "Marks of all students : " + marks);

     List<Integer> updatedMarks
         = marks.stream().filter(i -> i >50)
               .collect(Collectors.toList());

     System.out.println(
         "Marks of students who passed : "
         + updatedMarks);
 }
}
