package ro.ase.cts.teste.clase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSex() {
    }

    @Test
    public void getVarsta() {
    }


    @org.junit.Test
    public void testGetGen()
    {
        Persoana persoana=new Persoana("Matei", "1050325030019");
        Assert.assertEquals("M", persoana.getSex());


    }

    @org.junit.Test
    public void testGetGenDupa2000()
    {
        Persoana persoana=new Persoana("Matei", "6050325030019");
        Assert.assertEquals("F", persoana.getSex());


    }
    @org.junit.Test
    public void testCheckCNP()
    {
        Persoana persoana=new Persoana("Ana", "1050325030019");
        assertTrue(persoana.checkCNP());
    }

    @org.junit.Test
    public void testGenPersoanaBoundaryInferior()
    {
        Persoana persoana2=new Persoana("Mircea", "5000101987");
        assertEquals("M", persoana2.getSex());
    }

    @org.junit.Test
    public void testPersoanaNascutaAzi()
    {
        Persoana persoana3=new Persoana("Ana", "5260514030012");
        Assert.assertEquals(0, persoana3.getVarsta());
    }


    //test de cross check pt getgen
    @Test
    public void testGetGenCrossCheck()
    {
        Persoana persoana4=new Persoana("Andreea", "61234567890");
        String cnp=persoana4.CNP;
        String expected;
        if(cnp.charAt(0)%2==0)
        {
            expected="F";
        }else {
            expected="M";
        }


        String actual=persoana4.getSex();
        Assert.assertEquals( expected,  actual);



    }



    @Test(expected = IllegalArgumentException.class)
    public void testCheckLungimeCNP()
    {
        Persoana pers5=new Persoana("Andreea", "6123456789");
        pers5.checkCNP();
    }

}