import java.io.File;
import java.util.Scanner;

public class Height implements Interface {
    @Override
    public int wzrost(){
        int wzrost = 0;
        try{
            Scanner sc = new Scanner(new File("data.txt"));
            while(sc.hasNext()){
                if(sc.hasNextInt()) System.out.println(sc.nextInt());
                else{
                    sc.next();
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
        return wzrost;
    }

    @Override
    public String imie(){
        return null;
    }
}
