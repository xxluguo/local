import dao.BillMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pojo.Bill;
import pojo.Mybill;
import pojo.Provider;
import pojo.User;
import util.MybatisUtil;

import java.util.ArrayList;
import java.util.List;

public class TestMybatis {
    private static final Logger logger = LoggerFactory.getLogger(TestMybatis.class);

    @Test
    public void TestCountUser(){
        SqlSession sqlSession = null;
        List<User> userList = new ArrayList<User>();
        List<Provider> providerList = new ArrayList<Provider>();
        List<Bill> billList = new ArrayList<Bill>();
        List<Mybill> mybillList = new ArrayList<Mybill>();
        try {

            sqlSession = MybatisUtil.createSqlSession();
//            User user = new User();
//            user.setUserName("孙");
//            user.setUserRole(3L);
//            Map<String,String> userMap = new HashMap<String,String>();
//            userMap.put("uName","赵");
//            userMap.put("uRole","3")
            //S使用sqlsession创建dao接口的代理对象
//            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//            int count = userMapper.countUser();
//
//            logger.debug("123:"+count);
//            int count = sqlSession.selectOne("edu.nciae.dao.UserMapper.countUser");
//            userList = sqlSession.selectList("edu.nciae.dao.UserMapper.getUsers");
//            userList = sqlSession.getMapper(UserMapper.class).getUsers();
            //=======================================================
//            userList = sqlSession.getMapper(UserMapper.class).getUserList(user);
//            //logger.debug("用户表数据总量为："+count);
//            for(User user:userList){
//            logger.debug("用户列表的数据，usercode:"+user.getUserCode()+
//                    " and userName:"+user.getUserName()+" and userRoleName:"+user.getUserRoleName());
//        }
            //========================================
//            providerList = sqlSession.getMapper(ProviderMapper.class).findAll();
//            for(Provider provider:providerList){
//                logger.debug("列表的数据，usercode:"+provider.getId()+
//                        " and userName:"+provider.getProname()+" and userRoleName:");
//            }
            //========================================
//            Map<String,String> map = new HashMap<String, String>();
//            map.put("bName","水");
//            map.put("iD","1");
//            logger.debug("11111111111");
//            billList = sqlSession.getMapper(BillMapper.class).findBilldata(map);
//            //billList = sqlSession.getMapper(BillMapper.class).findAllBill();
//            System.out.println(billList.size());
//
//
//            for(Bill bbill:billList){
//                logger.debug("用户列表的数据，Billname:"+bbill.toString());
//            }
//            ===========================================
            billList=sqlSession.getMapper(BillMapper.class).findAllMyBill();
            for(Bill bbill:billList){
                //logger.debug("11111");
                logger.debug("用户列表的数据，Billname:"+bbill.toString());
        }



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
        //logger.debug("ceshi"+logger);
        //logger.debug();

//        for(Provider provider:providerList){
//            logger.debug("用户列表的数据，usercode:"+provider.getId()+
//            " and userName:"+""+" and userRoleName:");
//        }
//        logger.debug("-------------------");
//        for(User user:userList){
//            logger.debug("用户列表的数据，usercode:"+user.getUserCode()+
//                    " and userName:"+user.getUserName()+" and userRoleName:"+user.getUserRoleName());
//        }
//        Map<String,String> map = new HashMap<String, String>();
//        map.put("bName","水");
//        map.put("iD","1");
//        billList = sqlSession.getMapper(BillMapper.class).findBilldata(map);
//        for(Bill bill:billList){
//            logger.debug("用户列表的数据，Billname:"+bill.getProName());
//        }
        //--------------------------------------
//




    }
}
