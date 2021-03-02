class TabliceDwuwymiarowa{
    public static void main(String [] args){

        tablica2x2();

    }

    private static void tablica2x2(){
        int[][] tab2x2 = new int[3][];
        tab2x2[0] = new int[4];
        tab2x2[1] = new int[3];
        tab2x2[2] = new int[2];
        tab2x2[3] = new int[1];
        for(int i=0; i<tab2x2.length; i++){
            for(int j=0; j<tab[i].length; j++){
                System.out.println(tab[i][j]);
            }
        }
    }

    private static void tab2dFirst(){
        int[][] tab2b = new int[5][2]; 
        //commit: Stworzenie tablicy 2wymiarowej
        //przypisanie wartosci do tab 2wym.
        tab2d[0][1] = 50;
        tab2d[2][1] = -200;
        tab2d[4][0] = 444;
        //System.out.println(tab2d.length); //dlugosc tablicy 2wym. 
        //System.out.println(tab2d.length*tab2d[0].length); //ile elementow ma tablica w ogole    
        for (int i=0;i<tab2d.length;i++){
            for(int j=0;j<tab2d[i].length;j++){
                System.out.println(tab2d[i][0]+" "+tab2d[i][j]);
            }
            System.out.println("Koniec pętli ze zmienna j");
        }
        System.out.println("Koniec pętli ze zmienną i");
        //commit: wyswietlenie tablicy 2wym.
    }
    private static void PrzypomnenieTablicJednowymiarowych(){
        //Commit: Przypomnienie jak tworzy sie tablice 1wymiarowa    
        int [] tab = new int[5];
        //przypisanie do pierwszego elementu tablicy [index = 0] wartosci 40
        tab[0] = 40;
        //tak nie mozna bo error wyskkauje ze stringa nie mozna se na inta zrobic
        //tab[1] = "Jeden"; //error
         //wyświetlenie elementow tablicy:
            for(int i=0;i<tab.length;i++){
                System.out.println(tab[i]);
            }    
        //commit: Przypomnienie jak robic tab 1wym.
        
    }
} 
