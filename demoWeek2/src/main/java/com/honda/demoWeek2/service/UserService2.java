package com.honda.demoWeek2.service;

import com.honda.demoWeek2.model.User;
import com.honda.demoWeek2.repository.UserRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class UserService2 {
    public int bien;

    public int cong(){
        return bien++;
    }

}