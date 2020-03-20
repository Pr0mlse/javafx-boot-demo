package com.spartajet.fxboot.demo.dao;


import com.spartajet.fxboot.demo.entity.Hero;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface HeroMapper {

    Hero selectHero(int id);

    int insertHero(Hero hero);

    int updateHeroDamage(@Param("id") int id, @Param("damage") int damage);

    int deleteHero(int id);
}
