public abstract class Personagem {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;

    }

    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");

        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + pontosDeVida);
        System.out.println("Poder: " + poderBase);
    }

    // Método abstrato que será implementado pelas classes filhas
    public abstract void usarHabilidadeEspecial();
}




