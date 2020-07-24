package curso.spring.api.controller;


import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping(value = "/",produces = "application/jason")
    public ResponseEntity init(){

        return new ResponseEntity("Olá mundo!", HttpStatus.OK);
    }
}
