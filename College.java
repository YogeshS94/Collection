
public class College {
    
      int SNo;
     String studentName;
     int studentRoll;
     int studentclass;
   
 
     College(int SNo, String studentName, int studentRoll, int studentclass) {
        this.SNo = SNo;
        this.studentName = studentName;
        this. studentRoll = studentRoll;
        this.studentclass = studentclass;
   
    }
 
    // getters and setters
 
    public String toString() {
        return String.format("%d\t%s\t\t\t%d\t\t%d\t", SNo, studentName,studentRoll, studentclass);
    }
}