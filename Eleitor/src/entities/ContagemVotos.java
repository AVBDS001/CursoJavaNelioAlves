
package entities;


public class ContagemVotos {
    protected double  votosBrancos;
    protected double votosNulos;
    protected double votosValidos;
    protected double totalVotos;
    
    public ContagemVotos() {
    }

    public ContagemVotos(double votosBrancos, double votosNulos, double votosValidos, double totalVotos) {
        this.votosBrancos = votosBrancos;
        this.votosNulos = votosNulos;
        this.votosValidos = votosValidos;
        this.totalVotos = totalVotos;
    }

    public double getVotosBrancos() {
        return votosBrancos;
    }

    public double getVotosNulos() {
        return votosNulos;
    }
  
    public double getVotosValidos() {
        return votosValidos;
    }
    
    public double getTotalVotos() {
        return totalVotos;
    }
    
    public double contagem(double voto) {
        double percentage;
        return percentage = voto * 100 / totalVotos;
    }
}
