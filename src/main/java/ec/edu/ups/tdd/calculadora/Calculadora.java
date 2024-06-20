package ec.edu.ups.tdd.calculadora;

public class Calculadora {
    private int ans;
    public int sumar(int a, int b) {
        return a + b;
    }
    public int restar(int a, int b) {
        return a - b;
    }
    public int dividir(int a, int b) {
        return a / b ;
    }
    public int multiplicar(int a, int b) {
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return a * b;
    }
    public int getAns() {
        return ans;
    }
    public void setAns(int ans) {
        this.ans = ans;
    }
}