import java.io.File;
import java.util.Scanner;

public class Name implements Interface {
    @Override
    public int wzrost(){
        return 0;
    }

    @Override
    public String imie(){
        String imie = "";
        try{
            Scanner sc = new Scanner(new File("data.txt"));
            while(sc.hasNext()){
                if(sc.hasNextInt()) sc.next();
                else{
                    System.out.println(sc.next());
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return imie;
    }
}
