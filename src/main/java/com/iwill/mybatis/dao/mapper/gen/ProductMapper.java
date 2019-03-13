package com.iwill.mybatis.dao.mapper.gen;

import com.iwill.mybatis.dao.model.ProductDTO;
import com.iwill.mybatis.dao.model.ProductDTOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper {
    long countByExample(ProductDTOExample example);

    int deleteByExample(ProductDTOExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProductDTO record);

    int insertSelective(ProductDTO record);

    List<ProductDTO> selectByExample(ProductDTOExample example);

    ProductDTO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProductDTO record, @Param("example") ProductDTOExample example);

    int updateByExample(@Param("record") ProductDTO record, @Param("example") ProductDTOExample example);

    int updateByPrimaryKeySelective(ProductDTO record);

    int updateByPrimaryKey(ProductDTO record);
}