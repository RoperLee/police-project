package com.police.boot.service;

import com.police.boot.model.User;

/**
 * Created by roper on 2017/5/15.
 */
public interface UserServiceFacade {

    User getUserById(int id);

    String getUserNameById(int id);

}