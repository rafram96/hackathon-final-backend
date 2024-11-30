package com.project_dbp.hack_final.auth;

import com.project_dbp.hack_final.usuario.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    AuthenticationService authenticationService;
    @PostMapping("/signup")
    public ResponseEntity<JwtAuthenticationResponse> signup (@RequestBody Usuario usuario) {
        return ResponseEntity.ok(authenticationService.signup(usuario));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationResponse> login (@RequestBody Usuario usuario) {
        return ResponseEntity.ok(authenticationService.signin(usuario));
    }

    @GetMapping("/test")
    public String test () {
        return "Hello world";
    }
}