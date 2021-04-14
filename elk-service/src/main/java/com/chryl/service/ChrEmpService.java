package com.chryl.service;

import com.chryl.entity.ChrEmp;
import com.chryl.mapper.ChrEmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chr.yl on 2021/4/12.
 *
 * @author Chr.yl
 */
@Service
public class ChrEmpService {

    @Autowired
    private ChrEmpMapper chrEmpMapper;

    public List<ChrEmp> selectEmpAll() {
        return chrEmpMapper.selectEmpAll();
    }


}
