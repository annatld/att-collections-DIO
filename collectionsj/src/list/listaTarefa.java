package list;
 import java.util.ArrayList;
import java.util.List;
 
public class listaTarefa {
	 
	//atributo
	private List <Tarefa> tarefalist;

	public listaTarefa() {
		super();
		this.tarefalist = new ArrayList <> ();
	}
	
		//add tarefa na lista
	public void adicionarTarefa (String descricao) {
		tarefalist.add(new Tarefa (descricao));
	}
	
	//removendo tarefa com essa descrição
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefaParaRemover = new ArrayList<> ();	
		for (Tarefa t: tarefalist) {
			if (t.getDescricao ().equalsIgnoreCase(descricao)) {
				tarefaParaRemover.add(t);
				}	
			}
			
		tarefalist.removeAll(tarefaParaRemover);
}
		
	//quantidade de elementos
	public int obterNumeroTotalTarefa() {
		return tarefalist.size();
		}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefalist);
	}
		
	public static void main (String []args) {
		listaTarefa listaTarefa = new listaTarefa();
			System.out.println("total de elementos:" + listaTarefa.obterNumeroTotalTarefa());
			
			listaTarefa.adicionarTarefa("tarefa 1");
			listaTarefa.adicionarTarefa("tarefa 1");
			listaTarefa.adicionarTarefa("tarefa 3");
			System.out.println("total de elementos" + listaTarefa.obterNumeroTotalTarefa());
			
			
			listaTarefa.removerTarefa("tarefa 1");
			System.out.println("total de elementos" + listaTarefa.obterNumeroTotalTarefa());
			
			
			listaTarefa.obterDescricoesTarefas();
		}
}





