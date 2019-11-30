package br.com.javaAula04;

public class SuperHomem implements Voador{

    private int xp;

    public SuperHomem(int xp) {
        this.xp = xp;
    }

    @Override
    public void voar() {
        System.out.println("Estou voando como um campeão.");
        System.out.println("Minha experiência é: " + (this.xp+3));
    }
}
