package entities;

import entities_exceptions.FuncionarioExceptions;
public class Funcionario {
    private String nome;
    private Double salarioBase;
    private Character nivelCargo;
    
    public Funcionario() {
    }
    
    public Funcionario(String nome, Double salarioBase, Character nivelCargo) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.nivelCargo = nivelCargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Character getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(Character nivelCargo) {
        this.nivelCargo = nivelCargo;
    }
    
    public Double adicional(double porcentagemAdicional) {
        return salarioBase *= (1 + porcentagemAdicional / 100);
    }
    
    public Double impostoRenda(double porcentagemIR) {
        return salarioBase * porcentagemIR / 100;
    }
    
    public Double INSS(double porcentagemINSS) {
        return salarioBase * porcentagemINSS / 100;
    }
    
    public void validaCargo() {
        if (nivelCargo != 'G' && nivelCargo != 'F' && nivelCargo != 'E') {
            throw new FuncionarioExceptions("ERRO: O CARGO SELECIONADO É INVÁLIDO");
        }
    }
    
    public void validaSalario() {
        if ((nivelCargo == 'E' && salarioBase != 1200.00) || (nivelCargo == 'F' && salarioBase != 3500.00) || (nivelCargo == 'G' && salarioBase != 5000.00)) {
            throw new FuncionarioExceptions("ERRO: INSIRA A QUANTIDADE DE DINHEIRO BASEADA NA TABELA");
        }
    }
    
    @Override
    public String toString() {
        return "Nome do Funcionário: " + nome
               +"\nSalario Base: R$" + salarioBase
               +"\nNivel do cargo: " + nivelCargo;
    }
}
