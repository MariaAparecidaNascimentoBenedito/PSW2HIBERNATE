
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael.Soares
 */
@Entity
public class Produto {
    @Id
    private int ID;
    private String Descricao;
    private String Tamanho;
    private int Quantidade;
    private float valorPacote;
    private float valorFolha;
    private float peso;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getTamanho() {
        return Tamanho;
    }

    public void setTamanho(String Tamanho) {
        this.Tamanho = Tamanho;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public float getValorPacote() {
        return valorPacote;
    }

    public void setValorPacote(float valorPacote) {
        this.valorPacote = valorPacote;
    }

    public float getValorFolha() {
        return valorFolha;
    }

    public void setValorFolha(float valorFolha) {
        this.valorFolha = valorFolha;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

   

    
    
    
    
}
