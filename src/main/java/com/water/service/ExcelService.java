package com.water.service;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public interface ExcelService {
    void getExcel(Long id, Date beginDate, Date endDate, HttpServletResponse response);
}
