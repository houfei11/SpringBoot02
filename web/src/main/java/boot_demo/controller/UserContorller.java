package boot_demo.controller;


import boot_demo.domain.User;
import boot_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContorller {

    private final UserRepository userRepository;

    @Autowired
    public UserContorller(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/save")
    public User save(@RequestParam String name){
        User user = new User();
        user.setName(name);
        if (userRepository.save(user)){
            System.out.println("用户对象：% 保存成功！\n" + user);
        }
        return user;
    }
}
