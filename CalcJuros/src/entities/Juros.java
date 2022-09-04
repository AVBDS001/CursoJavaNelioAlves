package entities;

public class Juros {
	public double capitalInicial;
	public double taxaDeJuros;
	public double tempoDaAplicacao;
	
	
	public Juros (double capitalInicial, double taxaDeJuros, double tempoDaAplicacao) {
		this.capitalInicial = capitalInicial;
		this.taxaDeJuros = taxaDeJuros;
		this.tempoDaAplicacao = tempoDaAplicacao;
	}
	
	public double jurosSimples(double capitalInicial, double taxaDeJuros, double tempoDaAplicacao) {
		return capitalInicial + (capitalInicial * taxaDeJuros * tempoDaAplicacao);
	}
	
	public double jurosCompostos(double capitalInicial, double taxaDeJuros, double tempoDaAplicacao) {
		return capitalInicial * Math.pow((1 + taxaDeJuros), tempoDaAplicacao);
	}
}
