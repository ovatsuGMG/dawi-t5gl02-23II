package app;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Usuario;

public class Demo05 {
	//Listado de todos los Usuarios
	// encontrar y mostrar los datos de un Usuario, según su código.
	public static void main(String[] args) {
		// llamar a la conexión
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpa_sesion01");
		// crear un manejador de las entidades
		EntityManager manager = fabrica.createEntityManager();
		//select * from tb_usuarios --> Lista
		String jpql = "select u from Usuario u";
		List<Usuario> lstUsuarios = manager.createQuery(jpql, Usuario.class).getResultList();
		
		//mostrar el listado
		System.out.println("Listado de Usuarios");
		for (Usuario u : lstUsuarios) {
			System.out.println("Código......: " +u.getCod_usua());
			System.out.println("Nombre......: " +u.getNom_usua()+" "+u.getApe_usua());
			System.out.println("Tipo......: " +u.getIdtipo()+"-"+u.getObjTipo().getDescripcion());
			System.out.println("----------------------------------");
			
		}
		manager.close();
		
		
	}
}
