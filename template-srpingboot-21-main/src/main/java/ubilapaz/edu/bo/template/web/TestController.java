package ubilapaz.edu.bo.template.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ubilapaz.edu.bo.template.dto.Response;
import ubilapaz.edu.bo.template.dto.UserDto;
import ubilapaz.edu.bo.template.dto.UsuarioDto;
import java.time.LocalDateTime;

@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return new ResponseEntity<String>("Hola mundo!!", HttpStatus.OK);
    }

    @PostMapping("/test")
    public ResponseEntity<UsuarioDto> dto(){
        //Usuario
        //nombre: Pablo
        //usuario: pgarcia
        //estodo: true
        UsuarioDto user = new UsuarioDto();
        user.setNombre("Pablo");
        user.setUsuario("pgarcia");
        user.setEstado(true);
        user.setFechaRegistro(LocalDateTime.now());
        return new ResponseEntity<UsuarioDto>(user, HttpStatus.OK);
    }

    @GetMapping("/testDto")
    public ResponseEntity<Response> testDto(){
        Response response = new Response();
        response.setEstado(true);
        response.setMensaje("exito<");

        UsuarioDto u = new UsuarioDto();
        u.setNombre("pablo");
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @GetMapping("/dto")
    public ResponseEntity<UserDto> dtoGet(){
        UserDto u = new UserDto();
        u.setNombre("javier");
        u.setUsername("username.javier");

        return new ResponseEntity<UserDto>(u, HttpStatus.OK);
    }
}
