package practice.sessionlogin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    @GetMapping("/index")
    @ResponseBody
//매서드위에 responsebody 를만들면 기존의 RestController와 똑같다.ResponseBody 가 빠지는순간 애는 API 가아님
    String mainPage() {
        return "index";
    }

    @GetMapping("/login")
    String loginpage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(LoginRequest requset) {
        System.out.println("request = " + requset);

        //사용자 로그인 아이디화 비밀번호 검증

        return "redirect:/";
    }
}
