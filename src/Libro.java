import java.io.Serializable;

public class Libro implements Serializable {

	private String titulo = null;
	private String anyo = null;
	private String autor = null;
	private String editor = null;
	private int paginas = 0;

	public Libro(String tit, String any, String aut, String edit, int pag) {
		titulo = tit;
		anyo = any;
		autor = aut;
		editor = edit;
		paginas = pag;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnyo() {
		return anyo;
	}

	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public void print() {
		System.out.println("Título: " + titulo + " Año:  " + anyo + " Autor:  " + autor + 
				" Editor:  " + editor + "Páginas:  " + paginas);
	}

}