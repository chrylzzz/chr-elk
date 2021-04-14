package com.chryl.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Chr.yl on 2021/4/8.
 *
 * @author Chr.yl
 */
@Data
public class ChrEmp implements Serializable {

    private static final long serialVersionUID = -7333445576083396574L;


    private Long empId;

    private LocalDate empDate;//long节约空间


    private String empName;//纯英文,不中文分词

    private BigDecimal empSal;

    private Long companyId;

    private Long empIdcard;

    private Integer empCode;

    private String empStrDate;

    private String empRealName;
}
