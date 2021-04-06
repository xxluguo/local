package dao;


import org.apache.ibatis.annotations.Param;
import pojo.Bill;
import pojo.Provider;

import java.util.Date;
import java.util.List;

public interface ProviderMapper {
    public List<Provider> findAll ();
    public int addProvider(Provider provider);
    public int deleteProvider(@Param("id") int id);
    public int updateProvider(Provider provider);
    public Provider queryWithId(@Param("id") long id);
    public Provider queryWithIdtwo(@Param("id") long id);
    public List<Provider> queryProviderWithChoose(@Param("id") long id,
                                            @Param("proCode") String proCode,
                                            @Param("proName") String proName,
                                            @Param("creationDate") Date creationDate
    );
    public int updateProviderTwo(Provider provider);
    public int updateProviderThree(Provider provider);
    public List<Bill> queryWithIdThree(Integer[] billids);







}
