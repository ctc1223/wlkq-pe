package com.wlkq.pe.mapper;

import com.wlkq.pe.bean.PecUser;
import com.wlkq.pe.bean.PecUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PecUserMapper {
    long countByExample(PecUserExample example);

    int deleteByExample(PecUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PecUser record);

    int insertSelective(PecUser record);

    List<PecUser> selectByExample(PecUserExample example);

    PecUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PecUser record, @Param("example") PecUserExample example);

    int updateByExample(@Param("record") PecUser record, @Param("example") PecUserExample example);

    int updateByPrimaryKeySelective(PecUser record);

    int updateByPrimaryKey(PecUser record);
}