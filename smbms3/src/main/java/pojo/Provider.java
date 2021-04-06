package pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class Provider {
    private Long id;

    private String proCode;

    private String proName;

    private String proDesc;

    private String proContact;

    private String proPhone;

    private String proAddress;

    private String proFax;

    private Long createdBy;

    private Date creationDate;

    private Date modifyDate;

    private Long modifyBy;
    private List<Bill> billsList;

}