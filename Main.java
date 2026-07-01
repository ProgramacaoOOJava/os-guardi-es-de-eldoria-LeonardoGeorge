import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Criando personagens usando novas classes
        Guerreiro heroi1 = new Guerreiro("Arthus", 1, 100, 10.5, "Espada Flamejante");
        Guerreiro heroi2 = new Guerreiro("Lotus", 1 , 85, 13.5,"Arco Élfico");
        Mago heroi3 = new Mago("Alquimista", 1, 65, 16.0, "Bola de Fogo");
        Mago heroi4 = new Mago("Elenara", 1, 60, 18.0, "Raio de Gelo");
    
        //Demonstração do polimorfismo com ArrayList
        System.out.println("=== DEMONSTRAÇÃO DE POLIMORFISMO ===");
        System.out.println();

        ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(heroi1);
        personagens.add(heroi2);
        personagens.add(heroi3);
        personagens.add(heroi4);

        // Percorrendo a lista de personagem polimorficamente
        for (Personagem p : personagens) {
            p.exibirStatus();
            p.usarHabilidadeEspecial();
            System.out.println("---------------------------------------\n");
        }

        // Demonstração de que ainda podemos acessar métodos específicos
        System.out.println("=== MÉTODOS ESPECÍFICOS ===");
        System.out.println();

        System.out.println("\n=== CRIANDO GRUPOS ===");
        
        Grupo grupoHumanos = new Grupo();
        grupoHumanos.adicionarPersonagem(heroi1); // Arthus
        grupoHumanos.adicionarPersonagem(heroi3); // Alquimista

        Grupo grupoElfos = new Grupo();
        grupoElfos.adicionarPersonagem(heroi2); // Lotus
        grupoElfos.adicionarPersonagem(heroi4); // Elenara

        System.out.println("\n=== BATALHAS ===");
        grupoHumanos.batalhar(heroi1, heroi4); // Arthus vs Elenara

    }

}

