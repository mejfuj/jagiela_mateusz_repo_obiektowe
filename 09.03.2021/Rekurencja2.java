class Rekurencja2{
    public static void main(String [] args){
        int liczba = obliczanieSilni(21);
        /*System.out.println(""+Integer.MAX_VALUE);
        System.out.println(""+Long.MAX_VALUE);
        System.out.println("Wynik: "+liczba); */
        String wyraz = (wyswietlanieWyrazu("Anna"));
    }

            //Wprowadzamy: Anna
            /*
            Wynik: 
            Anna
            Ann
            An
            A
            */

    private static String wyswietlanieWyrazu(String wyraz){
        if(wyraz.length() > 1){
            return wyraz + "\n" + wyswietlanieWyrazu(wyraz.substring(0,wyraz.length()-1));
        }
        return wyraz;
    }

    private static int sumaKolejnychLiczb(int liczba){
       if(liczba > 0){
            System.out.println(liczba);
            return liczba+sumaKolejnychLiczb(liczba-1);
            //wprowadzamy liczbe 3
            //return 3 + (return + (return 1 + 0))
            //sumaKolejnychLiczb(3) + sumaKolejnychLiczb(2) + sumaKolejnychLiczb(1) + sumaKolejnychLiczb(0)
        } 
        System.out.println("Koniec rekurencji liczba = "+ liczba);
        return 0;
    }

    //Silnia 7! = 7*6*5*4*3*2*1
    private static int obliczanieSilni(int liczba){
        if(liczba > 1){
            return liczba * obliczanieSilni(liczba-1);
        }
        return 1;
    }
}

