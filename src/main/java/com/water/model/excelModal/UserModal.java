package com.water.model.excelModal;

import com.water.model.UserStat;

import java.util.Date;
import java.util.List;

public class UserModal {
    private String username;
    private Date startDate;
    private Date endDate;
    private List<UserStat> stats;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<UserStat> getStats() {
        return stats;
    }

    public void setStats(List<UserStat> stats) {
        this.stats = stats;
    }
}
