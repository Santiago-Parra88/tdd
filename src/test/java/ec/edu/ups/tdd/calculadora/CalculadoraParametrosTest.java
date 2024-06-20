package ec.edu.ups.tdd.calculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculadoraParametrosTest {
    private int a, b, expected;
    //debe ser estatico
    //Especificar la anotacion
    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{2, 4, 6});
        objects.add(new Object[]{1, 8, 9});
        objects.add(new Object[]{2, 5, 7});
        objects.add(new Object[]{7, 3, 10});
        objects.add(new Object[]{22, 4, 26});
        objects.add(new Object[]{12, 14, 26});
        return objects;
    }
    //Definir el constructor para instaciar cada ves el metodo y asignar los parametros
    public CalculadoraParametrosTest(int a, int b, int expected){
      this.a = a;
      this.b = b;
      this.expected = expected;
    }

    @Test
    public void dado_parametros_entonces_sumamos_entonces_sumar(){
        Calculadora c = new Calculadora();
        int actual = c.sumar(a,b);
        assertEquals(expected, actual);
        }
}