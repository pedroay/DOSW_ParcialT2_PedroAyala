package edu.eci.dosw.oficioya.controller;

import edu.eci.dosw.oficioya.dto.LoginRequestDTO;
import edu.eci.dosw.oficioya.dto.LoginResponseDTO;
import edu.eci.dosw.oficioya.service.AuthService;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usarioEnlace")
@Tag(name = "UsaurioEnlace",description = "operaciones relacionadas a los usarios de enlace")
public class UsarioEnlaceController {

    private final UsaurioEnlaceService usaurioEnlaceService ;

    @Autowired 
    public UsarioEnlaceController (usaurioEnlaceService UsaurioEnlaceService){
        this.usaurioEnlaceService = usaurioEnlaceService;
    }

    @PostMapping("/disponibilidad")
    public crearDisponiblidad(){}

}
