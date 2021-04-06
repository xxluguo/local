import com.sun.org.apache.bcel.internal.generic.NEW;
import dao.BillMapper;
import dao.ProviderMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pojo.Bill;
import pojo.Provider;
import util.MybatisUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestThreeMybaties {
    private static final Logger logger = LoggerFactory.getLogger(TestThreeMybaties.class);
   @Test
    public void testOne(){
       SqlSession sqlSession = null;
       Provider theProvider = new Provider();
       try {
           sqlSession = MybatisUtil.createSqlSession();
           theProvider = sqlSession.getMapper(ProviderMapper.class).queryWithId(1L);
           logger.debug("测试用户" + theProvider.getProName());
           for (Bill bill : theProvider.getBillsList()){
               logger.debug(theProvider.getId()+","+bill.getBillCode()+","+theProvider.getProCode()+","
               +theProvider.getProName()+","+theProvider.getProContact()+","
               +bill.getBillCode()+","+bill.getProductName()+","+bill.getIsPayment()+","
               +bill.getIsPayment());
           }


       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           sqlSession.close();
       }


   }
   @Test
   public void testthree(){
       SqlSession sqlSession = null;
       Provider theProvider = new Provider();
       List<Bill> billList = new ArrayList<Bill>();
       try {
           sqlSession = MybatisUtil.createSqlSession();
           Bill theBill = new Bill();
           theBill.setIsPayment(2);
           theBill.setProductName("米");
           billList = sqlSession.getMapper(BillMapper.class).findBillWithIdorName(theBill);

//           订单id、订单编码、商品名称、供应商id、供应商名称、订单金额、
//           是否付款、创建时间

           for (Bill bill : billList){
               logger.debug(bill.getId()+","+bill.getProductName()+","
               +bill.getBillCode()+","+bill.getProviderId()+","
               +bill.getProName()+","+bill.getTotalPrice()+","+bill.getIsPayment());
           }

       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           sqlSession.close();
       }


   }
   @Test
    public void testfour(){
        SqlSession sqlSession = null;
        Provider theProvider = new Provider();
        try {
            sqlSession = MybatisUtil.createSqlSession();
            theProvider = sqlSession.getMapper(ProviderMapper.class).queryWithIdtwo(1L);
            logger.debug("测试用户" + theProvider.getProName());
            for (Bill bill : theProvider.getBillsList()){
                logger.debug(theProvider.getId()+","+bill.getBillCode()+","+theProvider.getProCode()+","
                        +theProvider.getProName()+","+theProvider.getProContact()+","
                        +bill.getBillCode()+","+bill.getProductName()+","+bill.getIsPayment()+","
                        +bill.getIsPayment());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }

    }
    @Test
    public void testfive(){

            SqlSession sqlSession = null;
            Provider theProvider = new Provider();
            try {
                sqlSession = MybatisUtil.createSqlSession();
                Provider provider = new Provider();
                provider.setModifyDate(new Date());

//                provider.setModifyBy(1L);
                provider.setId(20L);
                int count = sqlSession.getMapper(ProviderMapper.class).updateProviderTwo(provider);
                sqlSession.commit();
                logger.debug("测试用户" + count);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
            }



    }
    @Test
    public void testsix(){

        SqlSession sqlSession = null;
        Provider theProvider = new Provider();
        List<Bill> billList = new ArrayList<Bill>();
        Integer[] billids = {1,2};

        try {
            sqlSession = MybatisUtil.createSqlSession();
            billList = sqlSession.getMapper(ProviderMapper.class).queryWithIdThree(billids);
//            sqlSession.commit();
            logger.debug("测试用户" );
            for (Bill bill:billList){
                logger.debug(bill.getId()+","+bill.getProductName()+","+bill.getProviderId());

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//
            MybatisUtil.closeSqlSession(sqlSession);

        }




    }
    @Test
    public void testseven(){

        SqlSession sqlSession = null;
        List<Provider> providerListList = new ArrayList<Provider>();
        try {
            sqlSession = MybatisUtil.createSqlSession();
            Date data = new Date();
            String proCode = "";
            Long id = 0L;
            String proName = "公司";
            providerListList = sqlSession.getMapper(ProviderMapper.class).queryProviderWithChoose(id,proCode,proName,data);
//            sqlSession.commit();
            logger.debug("测试用户" );
            for (Provider provider:providerListList){
//                logger.debug(p.getId()+","+bill.getProductName()+","+bill.getProviderId());
                logger.debug(provider.getProName()+""+provider.getProCode());

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//
            MybatisUtil.closeSqlSession(sqlSession);

        }




    }


}
