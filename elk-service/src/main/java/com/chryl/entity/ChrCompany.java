package com.chryl.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Chr.yl on 2021/4/8.
 *
 * @author Chr.yl
 */
@Data
public class ChrCompany implements Serializable {

    private static final long serialVersionUID = 7083418848729758708L;

    private Long companyId;

    private String companyName;

    private Integer companyCode;

    private String companyDescription;

    private String companyChinese;

}
