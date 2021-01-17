package cl.awakelab.interfaces;
import java.util.List;

import cl.awakelab.model.Useram;

public interface IAdultoDAO {	
		
		/*
		 * Metodo CRUD para manipular BD
		 */
		public void createUser(Useram usr);
		public List<Useram> readAll();
		public Useram readOne(int id);
		public void updateUser(Useram usr);	
		public void deletUser(Useram usr);	
		public void deleteUser(int id);
		public List<Useram> searchUser(String busqueda);
		

	
}
