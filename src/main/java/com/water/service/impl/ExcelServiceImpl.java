package com.water.service.impl;

import com.water.model.User;
import com.water.model.UserStat;
import com.water.model.excelModal.UserModal;
import com.water.repository.ExcelRepository;
import com.water.repository.UserRepository;
import com.water.service.ExcelService;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

@Service
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    ExcelRepository repository;

    @Autowired
    UserRepository userRepository;

    public void getExcel(Long id, Date beginDate, Date endDate, HttpServletResponse resp) {
        List<UserStat> userInfo = repository.findAllByUserBetweenPeriod(id, beginDate, endDate);
        UserModal modal = new UserModal();
        modal.setEndDate(endDate);
        modal.setStartDate(beginDate);
        User user = userRepository.findById(id);
        modal.setUsername(user.getName());
        modal.setStats(userInfo);
        try (InputStream is = ExcelServiceImpl.class.getResourceAsStream("/excelTemplate.xls")) {
            resp.setContentType("xls");
            resp.setHeader("Content-Disposition", "attachment;filename=" + beginDate + "_" + endDate);
            Context context = new Context();
            context.putVar("info", modal);
            JxlsHelper.getInstance().processTemplate(is, resp.getOutputStream(), context);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
