public class Main {
    public static void main(String[] args) {
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Personagem("Lotus", "Arqueira", 1, 85, 13.5);
        Personagem heroi3 = new Personagem("Alquimista", "Mago", 1, 65, 16);
        
        
        heroi1.exibirStatus();
        heroi2.exibirStatus();
        heroi3.exibirStatus();

    }
}
