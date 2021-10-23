package cn.shaoxiongdu.leagueoflegends.dao.impl;

import cn.shaoxiongdu.leagueoflegends.bean.Hero;
import cn.shaoxiongdu.leagueoflegends.dao.HeroDao;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-23 | 14:25
 */
public class HeroDaoImplTest {

    HeroDao heroDao = new HeroDaoImpl();

    @Test
    public void addHero() {
        Hero hero = new Hero();
        hero.setId("141");
        hero.setName("影流之镰");
        hero.setEnglishName("Kayn");

        heroDao.addHero(hero);
    }

    @Test
    public void deleteHeroById() {
    }

    @Test
    public void updateHero() {
        Hero hero = new Hero();
        hero.setId("1");
        hero.setName("影流之镰");
        hero.setEnglishName("Kayn");
        heroDao.updateHero(hero);
    }

    @Test
    public void queryHeroById() {
    }

    @Test
    public void queryAll() {
    }

    @Test
    public void queryTotalCount() {
    }

    @Test
    public void queryForLimit() {
    }
}