public class Parser_Biblioteca {

	public static void main(String[] args) {
				
		Parser parser = new Parser();
		parser.parseFicheroXml("src\\Biblioteca.xml");
		parser.parseDocument();
		parser.print();
		
	}

}