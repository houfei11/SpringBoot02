package boot_demo.config;

import boot_demo.domain.User;
import boot_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.Flux;

import java.util.Collection;

/**
 * 路由器函数   配置
 */
@Configuration
public class RouterFunctionConfiguration {

    /**
     * Servlet :
     *  请求接口：ServletRequest 或者 HttpServletRequest
     *  响应接口：ServletResponse 或者 HttpServletResponse
     *  Spring 5.0 重新定义了 服务请求和响应接口
     *
     * @param userRepository
     * @return
     */
    @Bean
    @Autowired
    public RouterFunction<ServerResponse> personFindAll(UserRepository userRepository){
        // 返回所有用户对象
        // Collection<User> users = userRepository.findAll();

        return RouterFunctions.route(RequestPredicates.GET( "/person/find/all"),
                request -> {
                    // 返回所有用户对象
                    Collection<User> users = userRepository.findAll();
                    Flux<User> userFlux = Flux.fromIterable(users);
                    return ServerResponse.ok().body(userFlux,User.class);
                });
    }
}
