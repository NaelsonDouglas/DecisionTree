package Ufal.DecisionTree;

import javax.swing.text.StyleContext.SmallAttributeSet;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;


public  class App  extends JFrame{
	
	
	private static final long serialVersionUID = 1L;
	protected static Node currentNode;
	protected static  JButton yesButton;
	protected static  JButton noButton;
	protected static  JButton restartButton;
	protected static  JLabel questionLabel;
	protected static  JFrame theFrame;
	protected static  JPanel thePanel;
	
	public static Node smartPhoneRoot;
    public static void main( String[] args )
    {
    	populateTree();
    	currentNode = smartPhoneRoot;    	
    	new App();    	
    	
    }
    
    public App(){
    	this.setSize(420,240);
    	
    	Toolkit tk = Toolkit.getDefaultToolkit();
    	Dimension dim = tk.getScreenSize();
    	int xPos = (dim.width/2) - (this.getWidth()/2);
    	int yPos = (dim.height/2) - (this.getHeight()/2);
    	this.setLocationRelativeTo(null);
    	this.setLocation(xPos,yPos);
    	this.setResizable(false);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setTitle("Trabalho de IA1");
    	
    			
    	thePanel = new JPanel();
    	yesButton = new JButton("Sim");
    	noButton = new JButton("Não");
    	restartButton = new JButton("Reiniciar");
    	questionLabel = new JLabel();
    	questionLabel.setText(currentNode.getCaput());
    	thePanel.add(questionLabel);
    	thePanel.add(yesButton);
    	thePanel.add(noButton);
    	thePanel.add(restartButton);
    	restartButton.setVisible(false);
    	
    	
    	yesButton.addActionListener(new ListenForButton());
    	noButton.addActionListener(new ListenForButton());
    	restartButton.addActionListener(new ListenForButton());
    	
    	theFrame = new JFrame();
    	
    	
    	this.add(thePanel);
    	this.setVisible(true);
    }
    
    public static void populateTree(){
    	smartPhoneRoot  =  new  Node("SmartPhone?",false);
    	
    	Node mp3 = new Node("MP3?",false);
    	Node colorido = new Node("Colorido?",false);
    	Node multichip = new Node("Multichip?",false);
    	Node quatroG = new Node("4G?",false);
    	Node cameraFrontal = new Node("Câmera Frontal?",false);
    	Node flash3G = new Node("Flash?",false);
    	Node tecladoFisico = new Node("Teclado Físico?",false);
    	Node giroscopio = new Node("Giroscópio?",false);
    	Node telaHD = new Node("Tela HD?",false);
    	Node flash4G = new Node("Flash?",false);
    	Node leitorBiometrico = new Node("Leitor Biométrico?",false);
    	
    	
    	
    	
    	Node motorolaC115 =  new Node("MotorolaC115",true);
    	Node lgB220A =  new Node("LG B220A",true);
    	Node motoE2 = new Node("Moto E2",true);
    	Node siemensGS556=  new Node("SiemensGS556",true);
    	Node multilaserP3298 =  new Node("Multilaser-P3298",true);
    	Node nokiaN8 =  new Node("Nokia N8",true);
    	Node blackBerryQ10 =  new Node("BlackBerry Q10",true);
    	Node xiaomiMiMix =  new Node("Xiaomi Mi Mix",true);
    	Node htc10 =  new Node("HTC 10",true);
    	Node galaxyS3 =  new Node("Galaxy S3",true);
    	Node googlePixelXL =  new Node("Google Pixel XL",true);
    	Node motoG4Play = new Node("Moto G4 Play",true);
    	Node motoG4 = new Node("Moto G4",true);
    	
    	
    	smartPhoneRoot.setNo(mp3);
    	mp3.setNo(colorido);
    	mp3.setYes(multichip);
    	colorido.setYes(lgB220A);
    	colorido.setNo(motorolaC115);
    	smartPhoneRoot.setYes(quatroG);
    	quatroG.setNo(cameraFrontal);
    	
    	cameraFrontal.setNo(flash3G);
    	tecladoFisico.setNo(nokiaN8);
    	tecladoFisico.setYes(blackBerryQ10);
    	flash3G.setNo(tecladoFisico);
    	giroscopio.setNo(xiaomiMiMix);
    	giroscopio.setYes(htc10);
    	flash3G.setYes(giroscopio);
    	telaHD.setNo(galaxyS3);
    	telaHD.setYes(googlePixelXL);
    	cameraFrontal.setYes(telaHD);
    	flash4G.setNo(motoE2);
    	quatroG.setYes(flash4G);
    	leitorBiometrico.setNo(motoG4Play);
    	leitorBiometrico.setYes(motoG4);
    	flash4G.setYes(leitorBiometrico);
    	leitorBiometrico.setNo(motoG4Play);
    	leitorBiometrico.setYes(motoG4);
    	
    	
    	
    	
    	
    }
    
    private class ListenForButton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == yesButton){
				if (currentNode.getYes() != null){
					currentNode = currentNode.getYes();		
				} else {
					restartMode();										
					return;
				}
			} else if(e.getSource() == noButton){
				if (currentNode.getNo() != null){
					currentNode = currentNode.getNo();
					
				} else{
					restartMode();
					return;
				}
			} else if (e.getSource() == restartButton){
				currentNode = smartPhoneRoot;    	
				askMode();
			}
			
			questionLabel.setText(currentNode.getCaput());
			
			
			if (currentNode.isLeaf()){
				restartMode();
			}
			
			
		}
		
		
		
		private void restartMode(){
			restartButton.setVisible(true);
			yesButton.setVisible(false);
			noButton.setVisible(false);
		}
		
		private void askMode(){
			restartButton.setVisible(false);
			yesButton.setVisible(true);
			noButton.setVisible(true);
		}
    	
    }
    
    
    
}
