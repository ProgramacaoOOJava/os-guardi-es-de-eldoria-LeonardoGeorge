public class Mago extends Personagem {
    private String magiaPrincipal;

    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, String magiaPrincipal) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.magiaPrincipal = magiaPrincipal;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Magia principal: " + magiaPrincipal);
    }

}

