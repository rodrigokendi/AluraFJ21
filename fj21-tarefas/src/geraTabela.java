import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.tarefas.modelo.Tarefa;

public class geraTabela {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		
		
		Tarefa tarefa = new Tarefa();
		tarefa.setDescricao("tarefa com hibernate");
		tarefa.setFinalizado(false);
		
		manager.getTransaction().begin();
		manager.persist(tarefa);
		manager.getTransaction().commit();
		
		//List<Tarefa> tarefas = manager.createQuery("select t from tarefa t");
		//tarefas.forEach(t -> System.out.println(t.getDescricao()));
		
		
		factory.close();
		
		
		
		

	}

}
