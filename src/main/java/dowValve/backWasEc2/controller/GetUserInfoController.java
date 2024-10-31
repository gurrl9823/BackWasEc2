package dowValve.backWasEc2.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/v1/user")
public class GetUserInfoController {

    @GetMapping("/getUserInfo")
    public UserInfo getUserInfo() {
        return UserInfo.builder().id(777).name("Nick").email("nick@example.com").build();
    }

}

@Builder
@Getter
@Setter
class UserInfo {
    private int id;
    private String name;
    private String email;
}