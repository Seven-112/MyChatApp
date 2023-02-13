package shine.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BackendApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	// @RestController
	// static class BootController {
	// 	@GetMapping("/{name}")
	// 	public ResponseEntity<String> askQuestion(@PathVariable(value = "name") String name) {
	// 		return ResponseEntity.ok("Hey " + name + ", do you like banana pudding?");
	// 	}
	// }

}
