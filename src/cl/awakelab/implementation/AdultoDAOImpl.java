package cl.awakelab.implementation;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.awakelab.connection.Conexion;
import cl.awakelab.interfaces.IAdultoDAO;

import cl.awakelab.model.Useram;





public class AdultoDAOImpl implements IAdultoDAO {

	@Override
	public void createUser(Useram am) {
		
		try {

			String sql = "insert into useram (am_run, am_nombre, am_edad) values ("
					+ am.getRun() + ", '" + am.getNombre() + "', '" + am.getEdad() + "')";

			Connection c = Conexion.getConnection();
			Statement s = c.createStatement();

			s.execute(sql);

		} catch (SQLException e) {
			System.out.println("ERROR: metodo createUser");
			e.printStackTrace();
		}

	}
	
	@Override
	public void createMessage(Useram am) {
		try {

			String sql = "insert into mensajes (mensaje, am_run) values ("
					+ am.getMensaje() + ", '" + am.getRun() + "')";

			Connection c = Conexion.getConnection();
			Statement s = c.createStatement();

			s.execute(sql);

		} catch (SQLException e) {
			System.out.println("ERROR: metodo createUser");
			e.printStackTrace();
		}

		
		
	}
	

	@Override
	public List<Useram> readAll() {
		List<Useram> lista = new ArrayList<Useram>();
		
		/*try {
			Connection c = Conexion.getConnection();
			Statement s = c.createStatement();
			String sql = "select am_nombre from useram";
			String sql1 = "select mensaje from mensajes";

			ResultSet rs = s.executeQuery(sql);
			ResultSet rs1 = s.executeQuery(sql1);

			while (rs.next()) {
				lista.add(new Useram(rs.getInt("am_run"), rs.getString("am_nombre"), 
						rs.getInt("am_edad")));
			}

		} catch (SQLException e) {
			System.out.println("ERROR: método readAll()");
			e.printStackTrace();
		}*/

		
		
		return lista;
	}

	@Override
	public Useram readOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(Useram am) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletUser(Useram am) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Useram> searchUser(String busqueda) {
		// TODO Auto-generated method stub
		return null;
	}
}
