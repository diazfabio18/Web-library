package com.biblioteca.ApiBiblioteca.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.ApiBiblioteca.Entity.Autor;
import com.biblioteca.ApiBiblioteca.Entity.Libro;
import com.biblioteca.ApiBiblioteca.Service.AutorService;




//Indiciamos que es un controlador rest
@RestController
@RequestMapping("/") //esta sera la raiz de la url, es decir http://127.0.0.1:8080/api/

public class AutorRestController {

	//Inyectamos el servicio para poder hacer uso de el
		@Autowired
		private AutorService userService;

		/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
		http://127.0.0.1:8080/api/users*/
		/*@GetMapping("/users")
		public List<User> findAll(){
			//retornará todos los usuarios
			return userService.findAll();
		}*/
		
		/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url + el id de un usuario
		http://127.0.0.1:8080/api/users/1*/
		/*@GetMapping("/users/{userId}")
		public User getUser(@PathVariable int userId){
			User user = userService.findById(userId);
			
			if(user == null) {
				throw new RuntimeException("User id not found -"+userId);
			}
			//retornará al usuario con id pasado en la url
			return user;
		}*/
		
		/*Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
		http://127.0.0.1:8080/api/users/  */
		//@PostMapping("/users")
		//public Autor addUser(@RequestBody Autor user) {
		//public Autor addUser(@Valid @RequestBody Autor user, @Valid @RequestBody Libro libro)
		
		//@PostMapping("/users")
		@GetMapping("/users/{name}/{nac}")
		
		//public Autor addUser(@PathParam("autorE") String name,@PathParam("nacionE") String nacion,@PathParam("libroE") String lib)
		//public Autor addUser(@Valid @RequestBody Libro libro)
		public Autor update(@PathVariable("name") final String name, @PathVariable("nac") final String nacion)
		{
			
			//Autor user = new Autor();
			//user.setNombre(name);
			//user.setNacionalidad(nacion);
			//Libro libro = new Libro();
			//libro.setTitulo(lib);
			//libro.setAutor(user);
			 
			Autor user = new Autor();
			//user = libro.getAutor();
			//Este metodo guardará al usuario enviado
			//userService.save(user);
			user.setNombre(name);
			user.setNacionalidad(nacion);
			
			userService.save(user);
			return user;
			
		}
		/*Este método se hará cuando por una petición PUT (como indica la anotación) se llame a la url
		http://127.0.0.1:8080/api/users/  */
		/*@PutMapping("/users")
		public User updateUser(@RequestBody User user) {
			
			userService.save(user);
			
			//este metodo actualizará al usuario enviado
			
			return user;
		}*/
		
		/*Este método se hará cuando por una petición DELETE (como indica la anotación) se llame a la url + id del usuario
		http://127.0.0.1:8080/api/users/1  */
		/*@DeleteMapping("users/{userId}")
		public String deteteUser(@PathVariable int userId) {
			
			User user = userService.findById(userId);
			
			if(user == null) {
				throw new RuntimeException("User id not found -"+userId);
			}
			
			userService.deleteById(userId);
			
			//Esto método, recibira el id de un usuario por URL y se borrará de la bd.
			return "Deleted user id - "+userId;
		}*/
}
