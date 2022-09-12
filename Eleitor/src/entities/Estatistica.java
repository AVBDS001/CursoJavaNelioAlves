
package entities;

public class Estatistica extends ContagemVotos {
    private double percentage;
    
    public Estatistica() {
    }

    public Estatistica(double votosBrancos, double votosNulos, double votosValidos, double totalVotos) {
        super(votosBrancos, votosNulos, votosValidos, totalVotos);
    }
    public double contagem(double voto) {
        return percentage = voto * 100 / totalVotos;
    }
}
