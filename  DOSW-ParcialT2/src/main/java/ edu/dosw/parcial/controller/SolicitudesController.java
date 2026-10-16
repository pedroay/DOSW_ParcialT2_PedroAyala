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
@RequestMapping("/api/solicitudes")
@Tag(name = "Solicitudes",description = "operaciones relacionadas a las solicitudes")
public class SolicitudesController {}