package ro.ase.cts.main;

import ro.ase.cts.lazy.Hotel;

public class Main {
    public static void main(String[] args)
    {
        Hotel hotel1= Hotel.getInstance("Hotel1", 2, 40);
        Hotel hotel2= Hotel.getInstance("Hotel2", 8, 45);

        hotel1.afisareInchiriereHotel();
        hotel1.afisareInchiriereHotel();

        hotel2.afisareInchiriereHotel();
        hotel2.afisareInchiriereHotel();

        hotel1.afisareInfoHotel();
        hotel2.afisareInfoHotel();

        //Hotel hotel=new Hotel(); //trb sa apara eroarea

    }

}
