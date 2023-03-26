package com.maniBlog.BlogbackEnd.Controller;

import com.maniBlog.BlogbackEnd.PayLoad.LoginDto;
import com.maniBlog.BlogbackEnd.Service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;
    @PostMapping(value = {"/login","/signin"})
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto){
       String response = authService.login(loginDto);
        return ResponseEntity.ok(response);
    }
}
