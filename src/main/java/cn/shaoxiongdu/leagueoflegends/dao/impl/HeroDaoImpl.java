package cn.shaoxiongdu.leagueoflegends.dao.impl;

import cn.shaoxiongdu.leagueoflegends.bean.Hero;
import cn.shaoxiongdu.leagueoflegends.dao.HeroDao;
import cn.shaoxiongdu.leagueoflegends.utils.C3P0Utils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-16 | 10:32
 */
public class HeroDaoImpl implements HeroDao {

    private QueryRunner queryRunner = new QueryRunner();

    private final Connection connection = C3P0Utils.getConnection();

    @Override
    public int addHero(Hero hero) {
        String sql = "INSERT INTO hero VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        int update = 0;
        try {
            update = queryRunner.update(
                    connection,
                    sql,
                    hero.getId(),
                    hero.getName(),
                    hero.getTitle(),
                    hero.getEnglishName(),
                    hero.getStory(),
                    hero.getAttack(),
                    hero.getDefense(),
                    hero.getMagic(),
                    hero.getDifficulty(),
                    hero.getHp(),
                    hero.getMoveSpeed(),
                    hero.getAttackRange(),
                    hero.getAttackSpeed(),
                    hero.getAllyTips(),
                    hero.getEnemyTips(),
                    hero.getAvatarURL(),
                    hero.geteSkillName(),
                    hero.geteSkillDescription(),
                    hero.geteSkillIconUrl(),
                    hero.getqSkillName(),
                    hero.getqSkillDescription(),
                    hero.getqSkillIconUrl(),
                    hero.getwSkillName(),
                    hero.getwSkillDescription(),
                    hero.getwSkillIconUrl(),
                    hero.getrSkillName(),
                    hero.getrSkillDescription(),
                    hero.getrSkillIconUrl(),
                    hero.getPassiveSkillName(),
                    hero.getPassiveSkillDescription(),
                    hero.getPassiveSkillIconUrl(),
                    hero.getVersion()
                    );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return update;
    }

    @Override
    public int deleteHeroById(String id) {
        String sql = "DELETE FROM hero WHERE id = ?";
        int update = 0;
        try {
            update = queryRunner.update(C3P0Utils.getConnection(), sql, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return update;
    }

    @Override
    public int updateHero(Hero hero) {
        String sql = "UPDATE hero SET " +
                "name = ?, " +
                "title = ?, " +
                "englishName = ?, " +
                "story = ?, " +
                "attack = ?, " +
                "defense = ?, " +
                "magic = ?, " +
                "difficulty = ?, " +
                "hp = ?, " +
                "moveSpeed = ?, " +
                "attackRange = ?, " +
                "attackSpeed = ?, " +
                "allyTips = ?, " +
                "enemyTips = ?, " +
                "eSkillName = ?, " +
                "eSkillDescription = ?, " +
                "eSkillIconUrl = ?, " +
                "qSkillName = ?, " +
                "qSkillDescription = ?, " +
                "qSkillIconUrl = ?, " +
                "wSkillName = ?, " +
                "wSkillDescription = ?, " +
                "wSkillIconUrl = ?, " +
                "rSkillName = ?, " +
                "rSkillDescription = ?, " +
                "rSkillIconUrl = ?, " +
                "passiveSkillName = ?, " +
                "passiveSkillDescription = ?, " +
                "passiveSkillIconUrl = ?, " +
                "version = ?" +
                " WHERE id = ?";

        int update = 0;
        try {
            update = queryRunner.update(
                    connection,
                    sql,
                    hero.getName(),
                    hero.getTitle(),
                    hero.getEnglishName(),
                    hero.getStory(),
                    hero.getAttack(),
                    hero.getDefense(),
                    hero.getMagic(),
                    hero.getDifficulty(),
                    hero.getHp(),
                    hero.getMoveSpeed(),
                    hero.getAttackRange(),
                    hero.getAttackSpeed(),
                    hero.getAllyTips(),
                    hero.getEnemyTips(),
                    hero.geteSkillName(),
                    hero.geteSkillDescription(),
                    hero.geteSkillIconUrl(),
                    hero.getqSkillName(),
                    hero.getqSkillDescription(),
                    hero.getqSkillIconUrl(),
                    hero.getwSkillName(),
                    hero.getwSkillDescription(),
                    hero.getwSkillIconUrl(),
                    hero.getrSkillName(),
                    hero.getrSkillDescription(),
                    hero.getrSkillIconUrl(),
                    hero.getPassiveSkillName(),
                    hero.getPassiveSkillDescription(),
                    hero.getPassiveSkillIconUrl(),
                    hero.getVersion(),
                    hero.getId()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return update;
    }

    @Override
    public Hero queryHeroById(String id) {

        String sql = "SELECT * FROM hero WHERE id = ?";
        Hero hero = null;
        try {
            hero = queryRunner.query(connection, sql,new BeanHandler<>(Hero.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hero;
    }

    @Override
    public List<Hero> queryAll() {
        String sql = "SELECT *  FROM hero";
        List<Hero> heroList = null;
        try {
            heroList = queryRunner.query(connection, sql,new BeanListHandler<>(Hero.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return heroList;
    }

    @Override
    public Long queryTotalCount() {
        String sql = "SELECT COUNT(*) FROM hero";
        Long totalCount = null;
        try {
            totalCount = (Long) queryRunner.query(connection, sql, new ScalarHandler());
        } catch (SQLException e) {
        }
        return totalCount;
    }

    @Override
    public List<Hero> queryForLimit(Integer begin, Integer pageSize) {
        String sql = "SELECT * FROM hero LIMIT ?,?";
        List<Hero> heroList = null;
        try {
            heroList = queryRunner.query(connection, sql, new BeanListHandler<>(Hero.class), begin, pageSize);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return heroList;
    }
}
