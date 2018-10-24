
package hotel;

import java.io.IOException;

class Menu {
    void menuOn(int what) throws IOException 
    {
        switch(what) {
            case '1':
                System.out.println("Panel dyrektora");
                System.out.println("1.Dodawanie pokoi hotelowych do systemu");
                System.out.println("1.Wydawanie i przyjmowanie pokoi");
                System.out.println("2.Okresowe wycofywanie pokoi i przywracanie użyteczności pokoi");
                break;
            case '2':
                System.out.println("Panel Recepcjonisty");
                System.out.println("1.Wydawanie i przyjmowanie pokoi");
                System.out.println("2.Wyszukiwanie wolnych pokoi");
                System.out.println("3.Rezerwacja pokoi");
                System.out.println("4.Kasowanie rezerwacji");
                break;
            case '3':
                System.out.println("Panel Sprzatacza");
                System.out.println("1.Wyszukiwanie pokoi do sprzątania");
                System.out.println("2.Sprzątanie");
                break;
            case '4':
                System.out.println("Panel gościa");
                System.out.println("1.wyszukiwanie wolnych pokoi");
                System.out.println("2.Rezerwacja pokoju");
                System.out.println("3.Kasowanie swojej rezerwacji");
                break;
                    }   
        System.out.println();
    }
    void showMenu()
    {
    System.out.println("Menu wyboru");
    System.out.println("1.Panel Dyrektora");
    System.out.println("2.Panel Recepcjonisty");
    System.out.println("3.Panel Sprzatacza");
    System.out.println("4.Panel gościa");
    }
    
}

class Pokoj 
{
    int numer;
    boolean status=true; // status pokoju (wolny - zajety)
    boolean sprzatanie = false; // czy pokoj jest do sprzatniecia podstawowo nie

    public Pokoj(int a)
    {
        numer = a;
    }
    
}

class Gosc
{
   
}

class Dyrektor
{
    
}

class Recepcjonista
{
    
}

class Sprzatacz
{
    
}


public class Hotel {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) 
        throws java.io.IOException {
       // int choice;
       
        Pokoj[] tab = new Pokoj[10];
        tab[0] = new Pokoj(1);
        System.out.println(tab[0].numer);

       // Menu hlobj = new Menu();
        
        //hlobj.showMenu();
       // choice = (int) System.in.read();
       // hlobj.menuOn(choice);
        }
    }
