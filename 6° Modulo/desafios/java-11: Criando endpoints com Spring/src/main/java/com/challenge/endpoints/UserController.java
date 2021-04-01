package com.challenge.endpoints;

import com.challenge.entity.User;
import com.challenge.service.impl.UserService;
import org.mapstruct.BeanMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> findUser(@PathVariable("id") Long id) {
        return this.userService.findById(id);
    }

    @GetMapping
    public List<User> findAcceleraionNameOrCompanyId(
            @PathParam("accelerationName") String accelerationName,
            @PathParam("companyId") Long companyId) {
        if (accelerationName != null) return this.userService.findByAccelerationName(accelerationName);
        return this.userService.findByCompanyId(companyId);
    }

}
