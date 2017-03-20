package io.egen.pojoClasses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//JACKSON Depency is imp.
//After receiving an HTTP request, DispatcherServlet consults the HandlerMapping to call the appropriate Controller.
//The Controller takes the request and calls the appropriate service methods based on used GET or POST method.
//The service method will set model data based on defined business logic and returns view name to the DispatcherServlet.
//controller should only have method mapping, repsonse body,code,request body

@Controller
// @RestController = controller + responcebody
public class UserController {

	@Autowired
	private UserService userService;

	// ResponseBody whatever the method returns instead of creating view, write
	// response-body directly,since its a restwebapi
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	// this method uses GET method, produces json , value = whenever there is
	// get request to /employee call this metod
	public List<User> findAll() {
		return userService.findAll();
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, value = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public User findOne(@PathVariable("id") String id) {
		return userService.findOne(id);
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, value = "/users", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	// the object User should be read from ResponceBody in post,also we consume
	// be prepared to use json value from requestbody, and when you read it
	// convert that into User object
	public User createUser(@RequestBody User user) {
		return userService.create(user);
	}

	@ResponseBody
	@RequestMapping(method = RequestMethod.PUT, value = "/users/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User update(@PathVariable("id") String id, @RequestBody User user) {
		return userService.update(user, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable("id") String id) {
		userService.delete(id);
	}
}
