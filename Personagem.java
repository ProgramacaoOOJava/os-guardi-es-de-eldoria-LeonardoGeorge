// Aqui estou criando a base para todos os personagens do jogo, ou seja, é a classe pai.
public abstract class Personagem {
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;

    }

    // Getter - Necessário para dar acesso a outras classes poderem usar os dados da class pai, já que agora estão privados.
    public String getNome() {
        return nome;
    } 

    public int getNivel() {
        return nivel;
    }

    public double getPoderBase() {
        return poderBase;
    }

    public String getClasse() {
        return classe;
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




