package cn.shaoxiongdu.leagueoflegends.dao;

import cn.shaoxiongdu.leagueoflegends.bean.Hero;

import java.util.List;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-23 | 14:09
 */
public interface HeroDao {

    public int addHero(Hero hero);

    public int deleteHeroById(String id);

    public int updateHero(Hero hero);

    public Hero queryHeroById(String id);

    public List<Hero> queryAll();

    Long queryTotalCount();

    List<Hero> queryForLimit(Integer begin, Integer pageSize);

}
