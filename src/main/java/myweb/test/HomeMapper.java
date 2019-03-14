package myweb.test;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {

    public List<TestVO> selectUser();
    
    public String selectId();
}