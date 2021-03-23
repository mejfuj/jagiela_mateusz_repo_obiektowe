import java.util.Scanner;

class PierwszyKonstruktor{
    public static void main (String[] args){
        obliczanieBMI();
    }
        
        public static void testowanie(){
        /*
        MojeBmi mb = new MojeBmi(190,86);
        mb.wzrost = 160;
        mb.waga = 80;
        */
        
        //Zmiana atrybutow obiektu poprzez konstruktor
        MojeBmi mb = new MojeBmi(190,86);
        ImieNazwisko im = new ImieNazwisko("Mateusz","Jagiela");        
        double wynik = mb.mojeBmi();
        System.out.println("BMI = "+wynik);
        //System.out.println(im.witaj());
        //System.out.println("Pola w obiekcie "+mb.wzrost+" "+mb.waga);
        
        mb.setWaga(65);
        mb.setWzrost(178);
        System.out.println("BMI = "+mb.mojeBmi());
        }
        
        public static void obliczanieBMI(){
        Scanner sc = new Scanner(System.in);
        int wzrost = 0;
        int waga = 0;
        
        System.out.print("Program oblicza BMI dla podanego wzrostu w cm i wagi w kg\n0 - zakoncz\n1 - oblicz\nWybor: ");

        int zakoncz = sc.nextInt();
        while(zakoncz != 0){
            System.out.print("Podaj wzrost w cm: ");
            wzrost = sc.nextInt();

            System.out.print("Podaj wage w kg: ");
            waga = sc.nextInt();

            MojeBmi mb = new MojeBmi(wzrost, waga);
            System.out.println("BMI = "+mb.mojeBmi());
        }   
    }
}