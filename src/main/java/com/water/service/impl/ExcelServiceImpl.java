package com.water.service.impl;

import com.water.model.UserStat;
import com.water.model.excelModal.UserModal;
import com.water.repository.ExcelRepository;
import com.water.repository.UserRepository;
import com.water.service.ExcelService;
import jxl.write.WriteException;
import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    ExcelRepository repository;

    @Autowired
    UserRepository userRepository;

    public void getExcel(Long id, Date beginDate, Date endDate) throws IOException, WriteException {
        List<UserStat> userInfo = repository.findAllByUserBetweenPeriod(id, beginDate, endDate);
        Collection userModals = new HashSet();
        for (UserStat u : userInfo) {
            UserModal modal = new UserModal();
            modal.setEndDate(new SimpleDateFormat("yyyy-MM-dd").format(endDate));
            modal.setStartDate(new SimpleDateFormat("yyyy-MM-dd").format(beginDate));
            modal.setName(u.getUser().getName());
            modal.setCurDate(new SimpleDateFormat("yyyy-MM-dd").format(u.getDay()));
            modal.setValue(u.getValue().toString());
            userModals.add(modal);
        }
        Map beans = new HashMap();
        beans.put("user", userModals);
        XLSTransformer transformer = new XLSTransformer();
        try {
            transformer.transformXLS("C:\\Users\\Aidar_2\\Desktop\\IoT\\Water\\Water\\src\\main\\resources\\users.xls", beans, "C:\\Users\\Aidar_2\\Desktop\\IoT\\Water\\Water\\src\\main\\resources\\users_output.xls");
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
