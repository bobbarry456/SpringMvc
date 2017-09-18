package Dao;

import com.controller.com.user.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Huangliniqng on 2017/9/18.
 */
//@Component
public interface UserDao {
    List<User> findAll() throws Exception;
}
