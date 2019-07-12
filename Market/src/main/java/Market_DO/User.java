package Market_DO;
import java.io.*;

/**
 * Esta clase representa a un usuario.
 * El usuario puede ser un cliente, un vendedor, etc.
 * Almacena sus datos personales así como un identificador
 * único, una clave y el tipo de usuario.
 * @author silverio
 * @version 201929051557
 */
public final class User implements Serializable{
	/**
	 * Valor UID del objeto para su serialización correcta.
	 */
	private static final long serialVersionUID = -4049425775355082994L;
	//Campos privados que definen a una instancia.
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String pass;
    private String ciudad;
    private String direccion;
    private String CP;
    private int userType_Id;

	/**
	 * Constructor de la clase User, configura mediante parámetros la instancia a crear.
	 * @param id del usuario
	 * @param nombre del usuario
	 * @param apellido del usuario
	 * @param email del usuario
	 * @param telefono del usuario
	 * @param pass clave personal del usuario
	 * @param ciudad de residencia habitual del usuario
	 * @param direccion del usuario
	 * @param CP Código Postal del usuario
	 * @param UserType Tipo de Usuario, 1 Admin, 2 Usuario generico (Cliente)
	 */
	public User(int id, String nombre,String apellido, String email, String telefono, String pass, String ciudad, String direccion, String CP, int UserType) {
		this.id = id;
		this.nombre =nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.pass = pass;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.CP = CP;
		this.userType_Id = UserType;		
	}

	/**
	 * Crea un nuevo usuario, no requiere parámetros a priori.
	 * Se configuran a posteriori.
	 */
	public User() {super();	}
	
	/**
	 * @return the id
	 */
	public int getId() {return id;}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {this.id = id;}

	/**
	 * @return the nombre
	 */
	public String getNombre() {return nombre;}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {this.nombre = nombre;}

	/**
	 * @return the email
	 */
	public String getEmail() {return email;}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {this.email = email;}

	/**
	 * @return the pass
	 */
	public String getPass() {return pass;}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {this.pass = pass;}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {return ciudad;}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {this.ciudad = ciudad;}

	/**
	 * @return the cP
	 */
	public String getCP() {return CP;}

	/**
	 * @param cP the cP to set
	 */
	public void setCP(String cP) {this.CP = cP;}

	/**
	 * @return the userType
	 */
	public int getUserType() {return userType_Id;}

	/**
	 * @param userType the userType to set
	*/
	public void setUserType(int userType) {userType_Id = userType;}

	/**
	 * @return el número de teléfono del usuario
	 */
	public String getTelefono() {return telefono;}
	
	/**
	 * Establece el número de teléfono del usuario
	 * @param telefono teléfono del usuario
	 */
	public void setTelefono(String telefono) {this.telefono = telefono;}

	/**
	 * @return the apellido
	 */
	public String getApellido() {return apellido;}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {this.apellido = apellido;}

	/**
	 * @return la dirección
	 */
	public String getDireccion() {return direccion;}


	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {this.direccion = direccion;}

	/**
	 * Devuelve el tipo de usuario.
	 * @return el tipo de usuario.
	 */
	public int getUserType_Id() {return userType_Id;}

	/**
	 * Establece el tipo de usuario.
	 * @param userType_Id el tipo de usuario a establecer.
	 */
	public void setUserType_Id(int userType_Id) {this.userType_Id = userType_Id;}
}