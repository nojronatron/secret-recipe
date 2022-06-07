package com.JonsSecretReceipe.SecretRecipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;
import org.mindrot.jbcrypt.BCrypt;

@Controller
public class AuthController {

    @Autowired
    SiteUserRepository siteUserRepository;

    @GetMapping("/signup") public String getSignupPage() { return "signup";}

    // acquire site user information submitted by the form, insert user into db, then send user to the login page
    @PostMapping("/signup") public RedirectView postNewUser(Model springModel, String username, String password) {
        String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt(11));
        SiteUser siteUser = new SiteUser(username, passwordHash);
        siteUserRepository.save(siteUser);

        // send the user to the login page
        return new RedirectView("login");
    }

    @GetMapping("/login") public String getLoginPage() {return "login";}

    // get the site user and validate login information then send to main web page if auth passes
    @PostMapping("/login") public RedirectView postAuthUser(String username, String password){
        SiteUser siteUser = siteUserRepository.findByUsername(username);

        if ((siteUser == null) || (!BCrypt.checkpw(password, siteUser.password))) {
            return new RedirectView("/login");
        }
        // for now just return a simple page to verify paths work
        return new RedirectView("/protectedpage");
    }

    @GetMapping("/protectedpage") public String getProtectedHomepage() { return "protectedpage"; }
}
