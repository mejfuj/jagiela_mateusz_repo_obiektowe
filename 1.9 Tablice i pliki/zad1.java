import java.util.Random;

class Tablice1{
    public static void main(String[] args){
    
        String tab2 [] = {"Jan","Mariusz","Mariola","Kacper","Michal","Katarzyna"};
        for(int i=0;i<tab2.length;i++){
            System.out.println(i+" -> "+tab2[i]);
        }
        
        String oceny [];
        for(int i = 0; i < 3; i++) {
            int rand = Math.random(); 
            System.out.println("ocena: " + rand);
        }

        //Wyświetlanie elementów tablicy -> pętla FOR
        /*for (int i=0;i<tab2.length;i++){
            System.out.println(i+" - "+tab2[i]);
        }*/
    }
}