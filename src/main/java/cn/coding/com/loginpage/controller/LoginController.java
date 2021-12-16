package cn.coding.com.loginpage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*@Author JosephCrypto
 *@Create 2021-38-12/16/21 8:38 PM
 */
@Controller
public class LoginController {

    @RequestMapping({"/", "login"})
    public String login() {
        return "login";
    }
}
