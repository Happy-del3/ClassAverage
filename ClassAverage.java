public class ClassAverage {
 
    public static void main(String[] args) {
        // Declare variables and constants
        java.util.Scanner sc = new java.util.Scanner(System.in);
        java.text.DecimalFormat df = new java.text.DecimalFormat("0.00");
        
        int grade, total = 0, gradeCounter = 0;
        
        System.out.print("Enter grade or -1 to quit: ");
        grade = sc.nextInt();
        
        while(grade != -1){
            total += grade;
            gradeCounter++;
            
            System.out.print("Enter grade or -1 to quit: ");
            grade = sc.nextInt();
        }
        if(gradeCounter != 0){
            double average = (double) total / gradeCounter;
            
            System.out.println("Total of the " + gradeCounter + " grades entered is " + total + "\n" +
                               "Class average is " + df.format(average));
        }else{
            System.out.println("No grades were entered");
        }
    }
    
}
