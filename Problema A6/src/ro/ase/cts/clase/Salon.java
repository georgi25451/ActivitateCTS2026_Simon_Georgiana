package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
   private boolean[] paturiLibere=new boolean[10];

    public Salon() {
        this.paturiLibere[1]=true;
        this.paturiLibere[5]=true;
        this.paturiLibere[8]=true;
        this.paturiLibere[9]=true;
    }

    public int getPatLiber()
    {
        for(int i=0; i<this.paturiLibere.length; i++)
        {
            if( this.paturiLibere[i])
            {
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int id)
    {
        this.paturiLibere[id]=false;
    }

}
