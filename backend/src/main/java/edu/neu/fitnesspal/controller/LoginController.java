package edu.neu.fitnesspal.controller;

import com.alibaba.fastjson.JSON;
import edu.neu.fitnesspal.bean.User;
import edu.neu.fitnesspal.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author valentinzhao
 * @since 2021/4/8
 */

@RestController
public class LoginController {

    @Autowired
    UserDao userDao;

    @CrossOrigin
    @RequestMapping("/login")
    public String userLogin(@RequestBody User user) {
        System.out.println("User : " + user);
        String str = "error";
        int count = userDao.getUserByMessage(user.getUsername(), user.getPassword());
        if (count > 0) {
            str = "ok";
        }
        Map<String, Object> res = new HashMap<>();
        res.put("flag", str);
        res.put("user", user);
        return JSON.toJSONString(res);
    }
}
