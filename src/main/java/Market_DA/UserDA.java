package Market_DA;

import java.sql.ResultSet;
import java.sql.SQLException;

import Market_DO.User;
import Market_DO.Login;
/**
 * Clase encargada de obtener una lista de todos los usuarios almacenados en el sistema
 * y introducir nuevos usuarios en la Base de Datos.
 * @author Silverio
 * @author Ayecora
 * @version 201905291515
 */
public class UserDA extends DataAccessCore{
	
	/**
	 * Devuelve una lista de usuarios almacenados en la Base de Datos
	 * @return devuelve la lista obtenida de todos los usuarios. Null en otro caso.
	 */
	public static ResultSet listaUsuarios()
	{
		try{			
			 resultSet = statement.executeQuery("SELECT * FROM USERS");
			return resultSet;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Añade un usuario a la BBDD.
	 * @param usuario el usuario que se desea añadir
	 * @return cadena de texto con el resultado de la operación.
	 */
	public static boolean addUsuarios(User usuario)
	{		
		//introduce la información de la instancia y la introduce en la BBDD
		try {
			String sentencia="INSERT INTO USERS (NOMBRE, APELLIDO, EMAIL, TELEFONO, PASS, CIUDAD, DIRECCION, CP, USER_TYPE_ID) VALUES('"
					+usuario.getNombre()
					+"','"+usuario.getApellido()
					+"','"+usuario.getEmail()
					+"','"+usuario.getTelefono()
					+"','"+usuario.getPass()
					+"','"+usuario.getCiudad()
					+"','"+usuario.getDireccion()
					+"','"+usuario.getCP()
					+"',"+usuario.getUserType()+");";
					
			statement.executeUpdate(sentencia);
			return true;
			 
		} catch (Exception e) {  //Imprime la traza en caso de excepción junto a un mensaje de aviso.
			System.out.println("\n>>>No ha sido posible introducir el usuario en la BBDD\n>>>\n");
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * Este método realiza el acceso de un usuario al sistema. Para ello comprueba el user y password del login contra la base de datos,
	 * devuelve ok si es correcto, o un par de string con el numbre del usuario y el tipo para crear la sesion
	 * @param login objeto Login el cual contiene el nombre de usuario (email) y su clave.
	 * @return datos del usuario que ha iniciado sesión, en caso de error devuelve null.
	 */
	public static String[] loginUser(Login login)
	{
		    String email = login.getEmail();   //obtiene el email introducido por el usuario.
		    String password = login.getPass(); //obtiene la clave introducida por el usuario.
		    //PARTE TEST DE BORRAR
		    delUser(2);
		    try{
		    	//Interroga a la base de datos con el query adecuado para la correlación de los datos.
				resultSet = statement.executeQuery("select * from users where EMAIL='" + email + "' and PASS='" +password + "'");
				//en caso de que la búsqueda haya devuelto un resultado.
				if (resultSet.next()) {
					String[] datos = {resultSet.getString("Nombre"),resultSet.getString("USER_TYPE_ID").toString()};
			        System.out.println(">>> Inicio de sesión Correcto");
					return datos;
			    } else { //en otro caso no hay resultados que coincidan.
			        System.out.println(">>> Error, nombre/clave introducidos incorrectos. No existe la tupla introducida en la BBDD");
			        return null;
			    }
			} catch (Exception ex) {
				ex.printStackTrace();
				return null;
			}    
	}
	
	/**
	 * Función que elimina a un usuario de la base de datos, para ello hace uso de un objeto Login,
	 * el cual contiene el email que identifica uniquivocamente a cada usuario.
	 * @param id del usuario que se debe eliminar.
	 * @return TRUE en caso de que se elimine al usuario, FALSE en caso contrario.
	 */
	public static boolean delUser(int id) {
		String sentencia = "DELETE FROM USERS WHERE ID = " + id;
		try {
			statement.executeUpdate(sentencia);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(">>> Error, no se ha podido eliminar al usuario.");
			return false;
		}
		System.out.println(">>>Usuario eliminado con éxito.");
		//TEST de BUSCAR USUARIO
		getUser(1);
		return true;
	}
	
	private static User getUser(int id) {
		// select * from users where EMAIL='" + email + "' and PASS='" +password + "'
		String sentencia = "SELECT * FROM USERS WHERE ID = " + id;
		try {
			resultSet = statement.executeQuery(sentencia);
			if (resultSet.next()) {
			System.out.println(">>> Usuario encontrado de ID: " +id + " nombre= "+ resultSet.getString("Nombre"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
