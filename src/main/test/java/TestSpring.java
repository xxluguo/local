import dao.ProviderMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Provider;
import pojo.User;
import util.MybatisUtil;

import java.util.Date;

public class TestSpring {
    private static final Logger logger = LoggerFactory.getLogger(TestSpring.class);
    @Test
    public void TestSpring(){
        SqlSession sqlSession = null;
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        try {
            User user = (User)context.getBean("user");
            logger.debug(""+user);

        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }
}
