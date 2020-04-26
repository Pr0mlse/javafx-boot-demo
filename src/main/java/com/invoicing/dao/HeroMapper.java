package com.invoicing.dao;


import com.invoicing.entity.Hero;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface HeroMapper {

    Hero selectHero(int id);

    int insertHero(Hero hero);

    int updateHeroDamage(@Param("id") int id, @Param("damage") int damage);

    int deleteHero(int id);
}
