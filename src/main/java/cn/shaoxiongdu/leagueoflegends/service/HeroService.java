package cn.shaoxiongdu.leagueoflegends.service;

import cn.shaoxiongdu.leagueoflegends.bean.Hero;
import cn.shaoxiongdu.leagueoflegends.bean.Page;

import java.util.List;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-23 | 17:08
 */
public interface HeroService {

    public void addHero(Hero hero);

    public void deleteHeroById(String id);

    public void updateHero(Hero hero);

    public Hero queryHeroById(String id);

    public List<Hero> queryAll();

    Page<Hero> page(Integer pageNo, Integer pageSize);

}
