package com.cyou.gr.dao;

import com.cyou.gr.entity.ManpowerTemplate;

public interface ManpowerTemplateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ManpowerTemplate record);

    int insertSelective(ManpowerTemplate record);

    ManpowerTemplate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ManpowerTemplate record);

    int updateByPrimaryKey(ManpowerTemplate record);
}