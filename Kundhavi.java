

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class Kundhavi
{
public static void main (String arg[])
{
List<College> list = new ArrayList<>(); 
list.add(new College(1,"ravi",12644,11));
list.add(new College(2,"lakshmi",12645,12)); 
list.add(new College(3,"yogesh",12646,13));
list.add(new College(4,"nithin",12647,14));
//Collections.sort(list,Collections.reverseOrder());
Collections.reverse(list); 
System.out.println("Reverse operation:"); 
System.out.println("SNo\t StudentName \t StudentRollNo \tStudentClass"  );
for(College str: list)
{ 
    System.out.println(str);
} 
}
}
    
    

