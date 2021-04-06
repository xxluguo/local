package dao;

import pojo.Bill;

import java.util.List;
import java.util.Map;

public interface BillMapper {
    public List<Bill> findBilldata(Map<String,String> billMap);
    public List<Bill> findAllBill();
    public List<Bill> findAllMyBill();
    public List<Bill> findBillWithIdorName(Bill bill);

}
