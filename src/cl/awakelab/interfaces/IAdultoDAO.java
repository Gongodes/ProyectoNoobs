package cl.awakelab.interfaces;
import java.util.List;

import cl.awakelab.model.Useram;

public interface IAdultoDAO {	
		
		/*
		 * Metodo CRUD para manipular BD
		 */
		public void createUser(Useram am);
		public void createMessage(Useram am);
		public List<Useram> readAll();
		public Useram readOne(int id);
		public void updateUser(Useram am);	
		public void deletUser(Useram am);	
		public void deleteUser(int id);
		public List<Useram> searchUser(String busqueda);
		

	
}
