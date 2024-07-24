package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivros {

	//atributo
private List <Livro> livroList;

public catalogoLivros() {
		this.livroList = new ArrayList<>();}
	
public void adicionarLivro (String titulo, String autor, int anoPublicacao){
		livroList.add(new Livro (titulo,autor,anoPublicacao));
}
	
public List <Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for (Livro l: livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
			}
		}
	
	}
		return livrosPorAutor;	
}
	
public List <Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		if(!livroList.isEmpty()) {
			for(Livro l: livroList) {
			if (l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao()<= anoFinal) {
				livrosPorIntervaloAnos.add(l);
				
				
			}
		}
	}
		
		
		return livroList;
	}
public Livro pesquisarPorTitulo(String titulo) {
	
	Livro livroPorTitulo=null;
	if(!livroList.isEmpty()) {
		for (Livro l: livroList) {
			if (l.getTitulo().equalsIgnoreCase(titulo)) {
				livroPorTitulo = l;
				break;
			}
		}
		
	}
	return livroPorTitulo;
	
}
public static void main(String []args) {
	catalogoLivros catalogoLivros = new catalogoLivros();
catalogoLivros.adicionarLivro("livro 1","autor 1", 2000);
catalogoLivros.adicionarLivro("livro 2","autor 2", 2001);
catalogoLivros.adicionarLivro("livro 3","autor 3 ", 2002);
catalogoLivros.adicionarLivro("livro 4","autor 4", 2003);
catalogoLivros.adicionarLivro("livro 5","autor 5", 2004);

System.out.println(catalogoLivros.pesquisarPorAutor("autor 2"));
System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2003));
System.out.println(catalogoLivros.pesquisarPorTitulo("livro 5"));

	}


	
}
