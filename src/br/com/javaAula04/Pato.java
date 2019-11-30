package br.com.javaAula04;

public class Pato implements Voador{

    private int energia;

    public Pato(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {

        System.out.println("Estou voando como um pato");
        System.out.println("E minha energia atual é: " + (this.energia-5));

    }

}
