import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        ArrayListvsTable.ArrayListvsTable(args);
        ArrayList<DaneOsobowe> listaDanychOsobowych = new ArrayList();
        DaneOsobowe do1 = new DaneOsobowe("Anna","Kowalska",20,150,59);
        DaneOsobowe do2 = new DaneOsobowe("Karol","Nowak",24,180,89);
        listaDanychOsobowych.add(do1);
        listaDanychOsobowych.add(do2);
        for(int i = 0;i<listaDanychOsobowych.size();i++){
            DaneOsobowe dos = listaDanychOsobowych.get(i);
            System.out.println(listaDanychOsobowych.get(i).bmi()+"\n");
        }
    }
}    