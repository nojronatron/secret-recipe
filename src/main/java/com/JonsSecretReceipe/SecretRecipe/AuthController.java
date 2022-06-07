package com.JonsSecretReceipe.SecretRecipe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import org.mindrot.jbcrypt.BCrypt;

@Controller
public class AuthController {
    @GetMapping("/signup") public String getSignupPage() { return "signup";}

    // acquire site user information submitted by the form, insert user into db, then send user to the login page
    @PostMapping("/signup") public RedirectView addUser(Model springModel, String _username, String _password) {
        String passwordHash = BCrypt.hashpw(_password, BCrypt.gensalt(11));
        // for now just push the user to the login page
        return new RedirectView("login");
    }

    @GetMapping("/login") public String getLoginPage() {return "login";}

    // get the site user and validate login information then send to main web page if auth passes
    @PostMapping("/login") public RedirectView getAuthUser(String _username, String _password){

        // for now just return a simple page to verify paths work
        return new RedirectView("main");
    }
}
