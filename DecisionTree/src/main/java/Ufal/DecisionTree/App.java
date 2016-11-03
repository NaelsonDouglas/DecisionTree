package Ufal.DecisionTree;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class App 
{
	
	public static Node smartPhoneRoot;
    public static void main( String[] args )
    {

    	populateTree();
    	
    	
    }
    
    
    
    public static void populateTree(){
    	smartPhoneRoot  =  new  Node("SmartPhone?");
    	
    	Node mp3 = new Node("MP3");
    	Node colorido = new Node("Colorido");
    	Node multichip = new Node("Multichip");
    	Node quatroG = new Node("4G");
    	Node cameraFrontal = new Node("Câmera Frontal");
    	Node flash3G = new Node("Flash");
    	Node tecladoFisico = new Node("Teclado Físico");
    	Node giroscopio = new Node("Giroscópio");
    	Node telaHD = new Node("Tela HD");
    	Node flash4G = new Node("Flash");
    	Node leitorBiometrico = new Node("Leitor Biométrico");
    	Node motoG4Play = new Node("Moto G4 Play");
    	Node motoG4= new Node("Moto G4");
    	
    	
    	smartPhoneRoot.setNo(mp3);
    	mp3.setNo(colorido);
    	mp3.setYes(multichip);
    	smartPhoneRoot.setYes(quatroG);
    	quatroG.setNo(cameraFrontal);
    	cameraFrontal.setNo(flash3G);
    	flash3G.setNo(tecladoFisico);
    	flash3G.setYes(giroscopio);
    	cameraFrontal.setYes(telaHD);
    	quatroG.setYes(flash4G);
    	flash4G.setYes(leitorBiometrico);
    	leitorBiometrico.setNo(motoG4Play);
    	leitorBiometrico.setYes(motoG4);
    	
    	
    	
    }
    
    
    
}
