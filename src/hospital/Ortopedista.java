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
public class Ortopedista extends Medico{

    public Ortopedista(int anoDoutoramento, String insEnsino, String idLicenca, String nome, String dataNascimento, String observacoes) {
        super(anoDoutoramento, insEnsino, idLicenca, nome, dataNascimento, observacoes);
    }
    
    public void analisar(Imagiologia raiox) {
        
    }
    
}
