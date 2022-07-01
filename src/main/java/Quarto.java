public class Quarto {
    private int numero;
    private int andar;
    private boolean ocupado;
    private double valorDiaria;

    public Quarto(int numero, int andar, boolean ocupado, double valorDiaria) {
        this.numero = numero;
        this.andar = andar;
        this.ocupado = ocupado;
        this.valorDiaria = valorDiaria;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
