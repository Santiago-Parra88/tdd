package ec.edu.ups.tdd.payment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway gateway = null;
    private PaymentProcessor processor = null;

    @Before
    public void setUp(){
        gateway = Mockito.mock(PaymentGateway.class);
        processor = new PaymentProcessor(gateway);
    }

    @Test
    public void dado_pago_cuando_es_correcto_entonces_ok() {

        Mockito.when(gateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        assertTrue(processor.makePayment(100));
    }
    @Test
    public void dado_pago_cuando_es_correcto_entonces_error() {

        Mockito.when(gateway.requestPayment(Mockito.any())).
                thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(processor.makePayment(100));
    }
}