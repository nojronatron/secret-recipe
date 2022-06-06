package com.JonsSecretReceipe.SecretRecipe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AuthController {
    @GetMapping("/signup") public String getSignupPage() { return "signup";}

    @PostMapping("/signup") public RedirectView addUser(Model springModel, String _username, String _password) {
        // TODO: implement signup functionality

        // for now just push the user to the login page
        return new RedirectView("login");
    }

    @GetMapping("/login") public String getLoginPage() {return "login";}

    @PostMapping("/login") public RedirectView getAuthUser(String _username, String _password){
        // TODO: implement login verification and protect access to authorized users only

        // for now just return a simple page to verify paths work
        return new RedirectView("main");
    }
}
