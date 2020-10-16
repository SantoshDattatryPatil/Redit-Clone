package com.santosh.redit.Redit.Clone.Controller;

import com.santosh.redit.Redit.Clone.dto.RegisterRequest;
import com.santosh.redit.Redit.Clone.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
@Autowired
private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest){
authService.signup(registerRequest);
return new ResponseEntity<>("User Registration Successful", HttpStatus.OK);
}
    @GetMapping("accountVerification/{token}")
    public ResponseEntity<String> verifyAccount(@PathVariable String token ){
    authService.verifyAccount(token);
    return  new ResponseEntity<>("Account Activated Successfully", HttpStatus.OK);
    }
}
