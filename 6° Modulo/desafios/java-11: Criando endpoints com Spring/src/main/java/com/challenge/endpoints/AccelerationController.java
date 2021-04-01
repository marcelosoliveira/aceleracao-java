package com.challenge.endpoints;

import com.challenge.entity.Acceleration;
import com.challenge.service.impl.AccelerationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/acceleration")
public class AccelerationController {

    @Autowired
    private AccelerationService accelerationService;

    @GetMapping("/{id}")
    public Optional<Acceleration> findAccelerationId(@PathVariable("id") Long id) {
        return this.accelerationService.findById(id);
    }

    @GetMapping
    public List<Acceleration> findCompanyId(@PathParam("companyId") Long companyId) {
        return this.accelerationService.findByCompanyId(companyId);
    }

}
