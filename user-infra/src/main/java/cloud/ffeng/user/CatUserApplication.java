package cloud.ffeng.user;

import cloud.ffeng.user.infra.dal.dao.UserInfoDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author cat-feng
 */
@RestController
@SpringBootApplication
public class CatUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(CatUserApplication.class, args);
    }

    @Resource
    private UserInfoDAO userInfoDAO;

    @GetMapping("/testDal")
    public Map<String, Object> test() {
        return userInfoDAO.select();
    }
}
