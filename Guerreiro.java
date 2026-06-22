public class Guerreiro extends Personagem {
    private String armaPrincipal;

    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase, String armaPrincipal) {
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
        this.armaPrincipal = armaPrincipal;
    }
    
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Arma principal: " + armaPrincipal);
    }
}
