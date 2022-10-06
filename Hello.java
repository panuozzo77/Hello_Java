import javax.swing.*;

public class Hello
{
	public static void main(String args[])
	{
	Maglietta prova = new Maglietta();
	
	prova.colore=JOptionPane.showInputDialog("Inserire colore maglia:");
	prova.marca=JOptionPane.showInputDialog("Inserire marca maglia:");
	prova.taglia=JOptionPane.showInputDialog("Inserire taglia:");
	prova.prezzo=Integer.parseInt(JOptionPane.showInputDialog("Inserire Prezzo:"));
	prova.printAll();
	}
	
}	   

class Maglietta
{
	String colore;
	String marca; 
	String taglia;
	int prezzo;
	public void printAll(){
		System.out.println("Marca: "+marca);
		System.out.println("Colore: "+colore);
		System.out.println("Taglia: "+taglia);
		System.out.println("Prezzo: "+prezzo);
	}
}


