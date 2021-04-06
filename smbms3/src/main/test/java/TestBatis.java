import dao.ProviderMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pojo.Provider;
import util.MybatisUtil;

import java.util.Date;

public class TestBatis {
    private static final Logger logger = LoggerFactory.getLogger(TestBatis.class);
    @Test
    public void TestUpdat(){
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtil.createSqlSession();
            Provider provider = new Provider();
//            provider.setId(18L);
//            provider.setModifydate(new Date());
            provider.setModifyDate(new Date());
//            provider.setModifyby(1L);
            provider.setModifyBy(1L);
            provider.setProCode("qq_000001");
//            provider.setProcode("qq_000001");
            provider.setProName("可口可乐");

//            provider.setProname("可口可乐");
            provider.setProDesc("长期合作伙伴，品:可乐，可乐可乐");
//            provider.setProdesc("长期合作伙伴，品:可乐，可乐可乐");
            provider.setProContact("张帅");
//            provider.setProcontact("张帅");
            ProviderMapper providerMapper = sqlSession.getMapper(ProviderMapper.class);
            int a = providerMapper.addProvider(provider);
            sqlSession.commit();
            logger.debug(""+a);


        }catch (Exception e){
            e.printStackTrace();
        }finally {

            sqlSession.close();
        }
    }

}
