/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Userpl022pc20
 */
public class Medico extends Utente{

    public Medico(int anoDoutoramento, String insEnsino, String idLicenca, String nome, String dataNascimento, String observacoes) {
        super(nome, dataNascimento, observacoes);
        this.anoDoutoramento = anoDoutoramento;
        this.insEnsino = insEnsino;
        this.idLicenca = idLicenca;
    }
    
    
    int anoDoutoramento;
    String insEnsino;
    String idLicenca;

    
    public void prescreverTratamento() {
    
}
}