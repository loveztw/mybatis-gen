package cn.comelo.mapper;

import cn.comelo.pojo.EhrAdmin;
import cn.comelo.pojo.EhrAdminExample;
import cn.comelo.utils.MyMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EhrAdminMapper extends MyMapper<EhrAdmin> {
    long countByExample(EhrAdminExample example);

    int deleteByExample(EhrAdminExample example);

    List<EhrAdmin> selectByExample(EhrAdminExample example);

    int updateByExampleSelective(@Param("record") EhrAdmin record, @Param("example") EhrAdminExample example);

    int updateByExample(@Param("record") EhrAdmin record, @Param("example") EhrAdminExample example);
}