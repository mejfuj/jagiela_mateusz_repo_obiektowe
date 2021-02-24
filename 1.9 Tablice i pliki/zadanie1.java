import java.util.Scanner;
import java.util.Random;
import java.io.*;

class Zadanie{
    public static void main(String args[]){
        Random r = new Random();
        int grades[] = new int[10];
        for (int i=0;i<grades.length;i++){
            grades[i] = r.nextInt(6)+1;
        }
        String students[] = new String[10];
        File f = new File("uczniowie.txt");
        try{
            Scanner sc = new Scanner(f);
            int i=0;
            while(sc.hasNext()){
                students[i] = sc.nextLine();
                i++;
            }
            String studentsGrades[] = new String[10];
            for (i=0;i<studentsGrades.length;i++){
                studentsGrades[i] = students[i]+" "+grades[i];
                System.out.println(studentsGrades[i]);
            }
        }catch(FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
