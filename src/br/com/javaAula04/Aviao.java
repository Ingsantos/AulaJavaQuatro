package br.com.javaAula04;

public class Aviao implements Voador {

    private int horasDeVoo;

    public Aviao(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }

    @Override
    public void voar() {

        System.out.println("Estou voando como um avião.");
        System.out.println("Minhas horas de voo são: " + (this.horasDeVoo+13));
    }
}
