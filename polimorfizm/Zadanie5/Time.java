import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Time implements Interface {
    @Override
    public int dni(){
        Scanner sc = new Scanner(System.in);

        int dzien = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int miesiac = Calendar.getInstance().get(Calendar.MONTH)+1;
        int rok = Calendar.getInstance().get(Calendar.YEAR);

        Calendar today = new GregorianCalendar(rok, miesiac, dzien);

        System.out.println("Podaj date urodzenia: (DD-MM-YYYY / YYYY-MM-DD)");
        String data = sc.next();
        String[] format = data.split("-");

        String l1 = format[0];
        String l2 = format[1];
        String l3 = format[2];

        int dzien_urodzenia = 0;
        int miesiac_urodzenia = 0;
        int rok_urodzenia = 0;

        if(l1.length() == 2 && l2.length() == 2 && l3.length() == 4){
            dzien_urodzenia = Integer.parseInt(l1);
            miesiac_urodzenia = Integer.parseInt(l2);
            rok_urodzenia = Integer.parseInt(l3);
        }else if (l1.length() == 4 && l2.length() == 2 && l3.length() == 2){
            dzien_urodzenia = Integer.parseInt(l3);
            miesiac_urodzenia = Integer.parseInt(l2);
            rok_urodzenia = Integer.parseInt(l1);
        }
        
        Calendar born = new GregorianCalendar(rok_urodzenia, miesiac_urodzenia, dzien_urodzenia);
        
        double roznica = today.getTimeInMillis() - born.getTimeInMillis();
        roznica = roznica/(24*60*60*1000);
        System.out.println(Math.round(roznica));
    
        return 0;
    }
}
