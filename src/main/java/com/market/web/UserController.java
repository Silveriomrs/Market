package com.market.web;

import Market_DO.*;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Clase controladora para la vista de usuario.
 * Dispone de los metodos para listar los usuarios, crear, eliminar o añadir.
 * Además dispone de los métodos necesarios para el control de registro e inicio de sesión
 * de los usuarios.
 * @author Silverio Manuel Rosales Santana
 * @version 201906270203
 */
@Controller
public class UserController {

	/**
	 * Método que devuelve una lista de los usuarios disponibles en un encapsulado de objeto ModelAndView
	 * @return lista de usuarios disponible en la base de datos
	 */
	@RequestMapping(value = "listaUsuarios", method = RequestMethod.GET)
	public ModelAndView listaUsers() 
	{
		List<User> listUsers = Market_BL.UserBL.listaUsuarios();
		ModelAndView MV = new ModelAndView("UserView");
		MV.addObject("listUsuarios", listUsers);
		return MV;
	}

	/**
	 * Método para añadir un usuario a la base de datos.
	 * @return el nombre de la vista a utilizar para la creación de un usuario.
	 */
	@RequestMapping(value = "AddUser", method = RequestMethod.GET)
	public String addUsers() {return "UserCreate";}
	
	/**
	 * Método que devuelve el nombre del JSP (vista) para crear un usuario.
	 * @return nombre de la vista que realiza el request.
	 */
	@RequestMapping(value = "UserCreateRequest", method = RequestMethod.GET)
	public String UserCreateRequest() {return "UserCreateRequest";}	
	
	/**
	 * Métoodo para la realización del acceso al sistema por un usuario (iniciar sesión)
	 * @return nombre de la vista para realizar el ingreso en sesión.
	 */
	@RequestMapping(value = "UserLogin", method = RequestMethod.GET)
	public String UserLogin() {return "loginform";}
	
	/**
	 * Método que enlaza la vista de acceso al sistema (Login) con el request.
	 * @return nombre de la vista que realiza el request.
	 */
	@RequestMapping(value = "UserLoginRequest", method = RequestMethod.GET)
	public String UserLoginRequest() {return "loginRequest";}
	
	/**
	 * Método para el cierre de sesión por parte de un usuario.
	 * @return nombre de la vista que realiza el cierre de sesión.
	 */
	@RequestMapping(value = "UserLogout", method = RequestMethod.GET)
	public String UserLogout() {return "Logout";}
	
	/**
	 * Método para obtener una ficha de usuario.
	 * @return retorna el nombre de la vista que muestra la ficha de usuario
	 */
	@RequestMapping(value = "userFicha", method = RequestMethod.GET)
	public String fichaUsuario() {
		return "/templates/FichaUsuario";
	}
	
	/**
	 * Método encargado de borrar un usuario.
	 * @return devuelve la vista para borrar el usuario
	 */
	@RequestMapping(value = "borrarUsuario", method = RequestMethod.GET)
	public String borrarUser() {
		System.out.println(">>> Parte Borrar Usuario\n");
		//el código que haga falta
		return "UserView";
	}
	
	/**
	 * Método encargado de la modificar a un usuario.
	 * @return la vista de modificación del usuario.
	 */
	@RequestMapping(value = "editarUsuario", method = RequestMethod.GET)
	public String modificarUser() {
		System.out.println(">>> Parte editar usuario\n");
		//el código que haga falta
		return "UserView";
	}

}
