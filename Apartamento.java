package Controle;


import Visao.ManipulaArquivoTexto;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Bernalle, Ana Carolina, Lara Galvani, Lorena Gomes
 */
public class Apartamento {
    
    ArrayList<Moradores> moradores;

    public Apartamento() {
        
        moradores = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Apartamentos{" + "moradores=" + moradores + '}';
    }
    
    public ArrayList<Moradores> getMoradores() {
        return moradores;
    }

    public void setMoradores(ArrayList<Moradores> moradores) {
        this.moradores = moradores;
    }  
       
    public void adicionaMorador(Moradores m){
        
        moradores.add(m);
    }
    
    public void removeMorador(Moradores m){
        
        moradores.remove(m);
    }
    
    
    
}
