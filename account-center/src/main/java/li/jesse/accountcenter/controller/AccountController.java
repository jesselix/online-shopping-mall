package li.jesse.accountcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/account/")
public class AccountController {

    /**
     * account login
     * @param account
     * @param password
     * @param session
     * @return
     */
    public Object login(String account, String password, HttpSession session) {

        return null;
    }
}
