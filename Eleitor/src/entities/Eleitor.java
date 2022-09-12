/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author aluno
 */
public class Eleitor {
    private String name;
    private String voteLocation;
    private String cpf;
    
    public Eleitor() {
    }

    public Eleitor(String name, String voteLocation, String cpf) {
        this.name = name;
        this.voteLocation = voteLocation;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoteLocation() {
        return voteLocation;
    }

    public void setVoteLocation(String voteLocation) {
        this.voteLocation = voteLocation;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNome: " + name);
        sb.append("\nLocal do voto: " + voteLocation);
        sb.append("\nCPF: " + cpf);
        sb.append("\n");
        return sb.toString();
                
    }
}
