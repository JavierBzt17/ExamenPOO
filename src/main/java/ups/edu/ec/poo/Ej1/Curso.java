package ups.edu.ec.poo.Ej1;

public class Curso {
    private int numero;
    private char paralelo;

    public Curso(char paralelo, int numero) {
        this.paralelo = paralelo;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getParalelo() {
        return paralelo;
    }

    public void setParalelo(char paralelo) {
        this.paralelo = paralelo;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "numero=" + numero +
                ", paralelo=" + paralelo +
                '}';
    }
}
