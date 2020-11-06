package com.educy.action;

import com.educy.service.UserService;
import com.opensymphony.xwork2.Action;
import lombok.Data;

/**
 * @Author 马小姐
 * @Date 2020-11-06 14:39
 * @Version 1.0
 * @Description:
 */

@Data
public class RegAction implements Action {

    private UserService userService;

    public RegAction(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String execute() throws Exception {
        userService.register();
        return Action.SUCCESS;
    }
}
