package cn.shaoxiongdu.leagueoflegends.service.impl;

import cn.shaoxiongdu.leagueoflegends.bean.Hero;
import cn.shaoxiongdu.leagueoflegends.bean.Page;
import cn.shaoxiongdu.leagueoflegends.dao.HeroDao;
import cn.shaoxiongdu.leagueoflegends.dao.impl.HeroDaoImpl;
import cn.shaoxiongdu.leagueoflegends.service.HeroService;

import java.util.List;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-23 | 17:10
 */
public class HeroServiceImpl implements HeroService {

    private HeroDao herodao = new HeroDaoImpl();

    @Override
    public void addHero(Hero hero) {
        herodao.addHero(hero);
    }

    @Override
    public void deleteHeroById(String id) {
        herodao.deleteHeroById(id);
    }

    @Override
    public void updateHero(Hero hero) {
        herodao.updateHero(hero);
    }

    @Override
    public Hero queryHeroById(String id) {
        return herodao.queryHeroById(id);
    }

    @Override
    public List<Hero> queryAll() {
        return herodao.queryAll();
    }

    @Override
    public Page<Hero> page(Integer pageNo, Integer pageSize) {

        Page<Hero> page = new Page<>();
        page.setPageSize(pageSize);
        page.setPageNo(pageNo);

        //设置总记录条数
        Long totalCount = herodao.queryTotalCount();
        page.setTotalCount(totalCount);

        //设置总页码
        long totalPageNo = totalCount / pageSize;
        if(totalCount % pageSize != 0){
            totalPageNo = totalPageNo+1;
        }
        page.setTotalPageNo(totalPageNo);

        //检查参数
        if(pageNo > totalPageNo || pageNo < 1){
            pageNo = 1;
        }
        //默认为5
        if(pageSize > 1000 || pageSize < 1){
            pageSize = 5;
        }

        //设置当前页记录
        Integer begin = (pageNo - 1) * pageSize;
        List<Hero> items = herodao.queryForLimit(begin,pageSize);
        page.setItems(items);
        return page;
    }
}
