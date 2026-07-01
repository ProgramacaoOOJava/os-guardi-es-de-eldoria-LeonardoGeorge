import java.util.ArrayList;

public class Grupo {
    
    // Encapsulamento; a lista é privada, só acessível pelos métodos da classe. 
    private ArrayList<Personagem> membros;

    public Grupo() {
        this.membros = new ArrayList<>();
    } 

    public void adicionarPersonagem(Personagem p) {
        membros.add(p);
        System.out.println(p.getNome() + " entrou no grupo");
    }

    // Exibir todos os personagens do grupo, delegando o metodo já existente
    public void listaPersonagens() {
        System.out.println("=== Membros do Grupo ===");
        for (Personagem p : membros) {
            p.exibirStatus();
        }
    }

    // Getter para acesso a lista (está privada).
    public ArrayList<Personagem> getMembros() {
        return membros;
    }

    // Calcula o poder total de um personagem.
    private int calcularPoderTotal(Personagem p) {
        return (int) (p.getNivel() * p.getPoderBase()); 
    }

    // Realiza a batalha entre dois personagens quaisquer.
    public void batalhar(Personagem a, Personagem b) {
        int poderA = calcularPoderTotal(a);
        int poderB = calcularPoderTotal(b);

        System.out.println("\n⚔️ Batalha: " + a.getNome() + " vs " + b.getNome());
        System.out.println(a.getNome() + " -> Poder total: " + poderA);
        System.out.println(b.getNome() + " -> Poder total: " + poderB);

        if (poderA > poderB) {
            System.out.println(a.getClasse() + " " + a.getNome() + " venceu! Poder total: " + poderA);
        } else if (poderB > poderA) {
            System.out.println(b.getClasse() + " " + b.getNome() + " venceu! Poder total: " + poderB);
        } else {
            System.out.println("Empate! Ambos com poder total: " + poderA);
        }
    }
}
