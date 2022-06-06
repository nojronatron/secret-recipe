package com.JonsSecretReceipe.SecretRecipe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProtectedAppController {

    @GetMapping("/main") public String getProtectedHomepage() {
        // generic route for now

        return "protectedpage";
    }
}
