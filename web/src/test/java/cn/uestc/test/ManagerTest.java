package cn.uestc.test;

import cn.uestc.dao.UsersMapper;
import cn.uestc.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//使用RunWith标签来使用spring提供的junit测试包，使用RunWith注解即可
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration注解可以让test文件夹下的测试类加载main文件夹下的xml配置文件
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void testInsertUserTest() {
        Users user = new Users();
        //数据库自增，不需要设置id
        user.setUserage(20);
        user.setUsername("cmz");
        int result = this.usersMapper.insertUser(user);
        System.out.println(result);
    }
}
