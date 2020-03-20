package com.spartajet.fxboot.demo.Service;

import com.spartajet.fxboot.demo.entity.Hero;
import com.spartajet.fxboot.demo.dao.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeroService {

    @Autowired
    private HeroMapper heroMapper;

    public Hero findHero(int id) {
        return heroMapper.selectHero(id);
    }

    public int addHero(String name){
        Hero hero = new Hero();
        hero.setName(name);
        hero.setHp(2000);
        hero.setDamage(500);
        return heroMapper.insertHero(hero);
    }

    public int updateHeroDamage(int id, int damage) {
        return heroMapper.updateHeroDamage(id, damage);
    }

    public int delHero(int id) {
        return heroMapper.deleteHero(id);
    }
}
