package ec.edu.ups.tdd.calculadora;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculadoraTest {
    //Se aplica refactorizacion
    ICalculadora c = null;
    @Before
    public void setUp() {
        c = Mockito.mock(ICalculadora.class);
    }
    //Metodo sumar sin refactorizar
    @Test
    public void dato_dos_enteros_cuando_sumo_cuando_ok() {
        ICalculadora c = Mockito.mock(ICalculadora.class);
        Mockito.when(c.sumar(2,3)).thenReturn(5);
        assertEquals(5, c.sumar(2,3));
    }
    //Metodos resta, multiplicacion y division se aplica refactorizacion
    @Test
    public void dato_dos_enteros_cuando_resto_cuando_ok() {
        Mockito.when(c.restar(4,2)).thenReturn(2);
        assertEquals(2, c.restar(4,2));
    }
    @Test
    public void dato_dos_enteros_cuando_multiplico_cuando_ok() {
        Mockito.when(c.multiplicar(4,4)).thenReturn(16);
        assertEquals(16, c.multiplicar(4,4));
    }
    @Test
    public void dato_dos_enteros_cuando_divido_cuando_ok() {
        Mockito.when(c.dividir(16,2)).thenReturn(8);
        assertEquals(8, c.dividir(16,2));
    }
}