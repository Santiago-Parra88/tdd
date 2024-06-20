package ec.edu.ups.tdd.calculadora;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculadoraTest {
    Calculadora calculadora = null;
    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass");
    }
    @Before
    public void setUp(){
        calculadora = new Calculadora();
        System.out.println("Inicializar");
    }
    @Test
    public void dato_dos_enteros_cuanto_sumamos_entonces_ok(){
        assertEquals(6, calculadora.sumar( 4,2));
        System.out.println("Tarea 1");
    }
    @Test
    public void dato_dos_enteros_cuanto_restamos_entonces_ok(){
        assertEquals(2, calculadora.restar( 4,2));
        System.out.println("Tarea 2");
    }
    @Test(expected = ArithmeticException.class)
    public void dato_dos_enteros_cuanto_dividimos_entonces_excepcion(){
        System.out.println("Tarea 3");
        assertEquals(3, calculadora.dividir(6 ,0));
    }
    @Test(timeout = 150)
    public void dato_dos_enteros_cuanto_multiplicamos_entonces_ok(){
        assertEquals(8, calculadora.multiplicar( 4,2));
        System.out.println("Tarea 4");
    }
    @After
    public void ejecutar_despues_de(){
        System.out.println("Ejecutar Despues de");
        calculadora.setAns(0);
        calculadora = null;
    }
    @AfterClass
    public static void despues_ejccuta_clase(){
        System.out.println("Despues Ejecuta Clase");
    }

}