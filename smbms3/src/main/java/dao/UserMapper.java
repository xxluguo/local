package dao;

import pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 查询用户表数据总量
     * @return
     */
    //public int countUser();
    public int countUser();

    /**
     * 查询用户表列表
     * @return
     */
    public List<User> getUsers ();

    public List<User> getUserByUserName(String userName);

    public List<User> getUserList(User user);

    public List<User> getUserByMap(Map<String, String> userMap);

}
