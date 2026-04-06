package ro.ase.cts.program;

import ro.ase.cts.builder.AutobuzLinie;
import ro.ase.cts.builder.AutobuzLinieBuilder;

public class Main {
    public static void main(String[] args)
    {
        //BUILDER:
        AutobuzLinie a=new AutobuzLinieBuilder("MERCEDES", "Florin Mitroi")
                .setOprireCapat(true)
                .setDeschidereUsiAutomate(false)
                .setTextDerulator("Buna ziua!")
                .build();

        System.out.println(a);
    }

}
