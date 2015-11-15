package com.water.service;

import jxl.write.WriteException;

import java.io.IOException;
import java.util.Date;

public interface ExcelService {
    void getExcel(Long id, Date beginDate, Date endDate) throws IOException, WriteException;
}
