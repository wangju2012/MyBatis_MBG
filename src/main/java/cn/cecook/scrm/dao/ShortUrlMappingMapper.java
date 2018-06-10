package cn.cecook.scrm.dao;

import cn.cecook.scrm.entity.ShortUrlMapping;
import cn.cecook.scrm.entity.ShortUrlMappingKey;

public interface ShortUrlMappingMapper {
    int deleteByPrimaryKey(ShortUrlMappingKey key);

    int insert(ShortUrlMapping record);

    int insertSelective(ShortUrlMapping record);

    ShortUrlMapping selectByPrimaryKey(ShortUrlMappingKey key);

    int updateByPrimaryKeySelective(ShortUrlMapping record);

    int updateByPrimaryKey(ShortUrlMapping record);
}