package Ufal.DecisionTree;

public class Node {
	
	private Node yes;
	private Node no;
	private String caput;
	boolean leaf;
	
	public void setYes(Node yesNode){
		yes = yesNode;
	}
	
	public void setNo(Node noNode){
		no = noNode;
	}
		
	public  Node(){
		caput = "";
		yes = null;
		no = null;		
	}

	
	
	public Node(Node yes, Node no, String caput,boolean leaf) {
		super();
		this.yes = yes;
		this.no = no;
		this.caput = caput;
	}
	
	
	
	public Node(String caput, boolean leaf) {		
		this.caput = caput;
		this.yes = null;
		this.no = null;
		this.leaf = leaf;
	}
	

	public Node getYes() {
		return yes;
	}

	public Node getNo() {
		return no;
	}

	public String getCaput() {
		return caput;
	}

	public boolean isLeaf() {
		return leaf;
	}
	

}
