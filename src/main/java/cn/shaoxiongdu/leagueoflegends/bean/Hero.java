package cn.shaoxiongdu.leagueoflegends.bean;

import java.util.StringJoiner;

/**
 * @description: 英雄实体类
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-23 | 11:55
 */
public class Hero {

    /**
     * 英雄ID
     */
    private String id;

    /**
     * 名称
     */
    private String name;

    /**
     * 称号
     */
    private String title;

    /**
     *  英文名
     */
    private String englishName;

    /**
     *  背景故事
     */
    private String story;

    /**
     * 物理攻击
     */
    private double attack;

    /**
     * 防御能力
     */
    private double defense;

    /**
     * 魔法攻击
     */
    private double magic;

    /**
     * 上手难度
     */
    private double difficulty;

    /**
     * 初始血量
     */
    private double hp;

    /**
     * 移动速度
     */
    private double moveSpeed;

    /**
     * 攻击范围
     */
    private double attackRange;

    /**
     * 攻速
     */
    private double attackSpeed;

    /**
     *  友军提示
     */
    private String allyTips;

    /**
     * 敌军提示
     */
    private String enemyTips;

    /**
     * 头像
     */
    private String avatarURL;


/////////////////////////////////////////////////////////技能
    /**
     * e技能名称
     */
    private String eSkillName;

    /**
     * e技能描述
     */
    private String eSkillDescription;

    /**
     * e技能图标
     */
    private String eSkillIconUrl;


    /**
     * q技能名称
     */
    private String qSkillName;

    /**
     * q技能描述
     */
    private String qSkillDescription;

    /**
     * q技能图标
     */
    private String qSkillIconUrl;

    /**
     * w技能名称
     */
    private String wSkillName;

    /**
     * w技能描述
     */
    private String wSkillDescription;

    /**
     * w技能图标
     */
    private String wSkillIconUrl;

    /**
     * r技能名称
     */
    private String rSkillName;

    /**
     * r技能描述
     */
    private String rSkillDescription;

    /**
     * r技能图标
     */
    private String rSkillIconUrl;

    /**
     * 被动技能名称
     */
    private String passiveSkillName;

    /**
     * 被动技能描述
     */
    private String passiveSkillDescription;

    /**
     * 被动技能图标
     */
    private String passiveSkillIconUrl;

    /**
     * 数据版本
     */
    private String version;



    /**
     * 无参构造
     */
    public Hero() {
    }

    /**
     * 带参构造
     * @param id
     * @param name
     * @param title
     * @param englishName
     * @param story
     * @param attack
     * @param defense
     * @param magic
     * @param difficulty
     * @param hp
     * @param moveSpeed
     * @param attackRange
     * @param attackSpeed
     * @param allyTips
     * @param enemyTips
     * @param eSkillName
     * @param eSkillDescription
     * @param eSkillIconUrl
     * @param qSkillName
     * @param qSkillDescription
     * @param qSkillIconUrl
     * @param wSkillName
     * @param wSkillDescription
     * @param wSkillIconUrl
     * @param rSkillName
     * @param rSkillDescription
     * @param rSkillIconUrl
     * @param passiveSkillName
     * @param passiveSkillDescription
     * @param passiveSkillIconUrl
     * @param version
     */
    public Hero(String id, String name, String title, String englishName, String story, double attack, double defense, double magic, double difficulty, double hp, double moveSpeed, double attackRange, double attackSpeed, String allyTips, String enemyTips, String eSkillName, String eSkillDescription, String eSkillIconUrl, String qSkillName, String qSkillDescription, String qSkillIconUrl, String wSkillName, String wSkillDescription, String wSkillIconUrl, String rSkillName, String rSkillDescription, String rSkillIconUrl, String passiveSkillName, String passiveSkillDescription, String passiveSkillIconUrl, String version) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.englishName = englishName;
        this.story = story;
        this.attack = attack;
        this.defense = defense;
        this.magic = magic;
        this.difficulty = difficulty;
        this.hp = hp;
        this.moveSpeed = moveSpeed;
        this.attackRange = attackRange;
        this.attackSpeed = attackSpeed;
        this.allyTips = allyTips;
        this.enemyTips = enemyTips;
        this.eSkillName = eSkillName;
        this.eSkillDescription = eSkillDescription;
        this.eSkillIconUrl = eSkillIconUrl;
        this.qSkillName = qSkillName;
        this.qSkillDescription = qSkillDescription;
        this.qSkillIconUrl = qSkillIconUrl;
        this.wSkillName = wSkillName;
        this.wSkillDescription = wSkillDescription;
        this.wSkillIconUrl = wSkillIconUrl;
        this.rSkillName = rSkillName;
        this.rSkillDescription = rSkillDescription;
        this.rSkillIconUrl = rSkillIconUrl;
        this.passiveSkillName = passiveSkillName;
        this.passiveSkillDescription = passiveSkillDescription;
        this.passiveSkillIconUrl = passiveSkillIconUrl;
        this.version = version;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Hero.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("头像URL = " + avatarURL)
                .add("名称='" + name + "'")
                .add("称号='" + title + "'")
                .add("英文名称='" + englishName + "'")
                .add("背景故事='" + story + "'")
                .add("物理攻击=" + attack)
                .add("物理防御=" + defense)
                .add("魔法攻击=" + magic)
                .add("上手难度=" + difficulty)
                .add("初始血量=" + hp)
                .add("移动速度=" + moveSpeed)
                .add("攻击范围=" + attackRange)
                .add("攻击速度=" + attackSpeed)
                .add("友军提示='" + allyTips + "'")
                .add("敌军提示='" + enemyTips + "'")
                .add("e技能名称='" + eSkillName + "'")
                .add("e技能说明='" + eSkillDescription + "'")
                .add("e技能图标网址='" + eSkillIconUrl + "'")
                .add("q技能名称='" + qSkillName + "'")
                .add("q技能说明='" + qSkillDescription + "'")
                .add("q技能图标网址='" + qSkillIconUrl + "'")
                .add("w技能名称='" + wSkillName + "'")
                .add("w技能说明='" + wSkillDescription + "'")
                .add("w技能图标网址='" + wSkillIconUrl + "'")
                .add("r技能名称='" + rSkillName + "'")
                .add("r技能说明='" + rSkillDescription + "'")
                .add("r技能图标网址='" + rSkillIconUrl + "'")
                .add("被动技能名称='" + passiveSkillName + "'")
                .add("被动技能说明='" + passiveSkillDescription + "'")
                .add("被动技能图标网址='" + passiveSkillIconUrl + "'")
                .add("版本='" + version + "'")
                .toString();
    }

    public String getId() {
        return id;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getMagic() {
        return magic;
    }

    public void setMagic(double magic) {
        this.magic = magic;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(double moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public double getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(double attackRange) {
        this.attackRange = attackRange;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public String getAllyTips() {
        return allyTips;
    }

    public void setAllyTips(String allyTips) {
        this.allyTips = allyTips;
    }

    public String getEnemyTips() {
        return enemyTips;
    }

    public void setEnemyTips(String enemyTips) {
        this.enemyTips = enemyTips;
    }

    public String geteSkillName() {
        return eSkillName;
    }

    public void seteSkillName(String eSkillName) {
        this.eSkillName = eSkillName;
    }

    public String geteSkillDescription() {
        return eSkillDescription;
    }

    public void seteSkillDescription(String eSkillDescription) {
        this.eSkillDescription = eSkillDescription;
    }

    public String geteSkillIconUrl() {
        return eSkillIconUrl;
    }

    public void seteSkillIconUrl(String eSkillIconUrl) {
        this.eSkillIconUrl = eSkillIconUrl;
    }

    public String getqSkillName() {
        return qSkillName;
    }

    public void setqSkillName(String qSkillName) {
        this.qSkillName = qSkillName;
    }

    public String getqSkillDescription() {
        return qSkillDescription;
    }

    public void setqSkillDescription(String qSkillDescription) {
        this.qSkillDescription = qSkillDescription;
    }

    public String getqSkillIconUrl() {
        return qSkillIconUrl;
    }

    public void setqSkillIconUrl(String qSkillIconUrl) {
        this.qSkillIconUrl = qSkillIconUrl;
    }

    public String getwSkillName() {
        return wSkillName;
    }

    public void setwSkillName(String wSkillName) {
        this.wSkillName = wSkillName;
    }

    public String getwSkillDescription() {
        return wSkillDescription;
    }

    public void setwSkillDescription(String wSkillDescription) {
        this.wSkillDescription = wSkillDescription;
    }

    public String getwSkillIconUrl() {
        return wSkillIconUrl;
    }

    public void setwSkillIconUrl(String wSkillIconUrl) {
        this.wSkillIconUrl = wSkillIconUrl;
    }

    public String getrSkillName() {
        return rSkillName;
    }

    public void setrSkillName(String rSkillName) {
        this.rSkillName = rSkillName;
    }

    public String getrSkillDescription() {
        return rSkillDescription;
    }

    public void setrSkillDescription(String rSkillDescription) {
        this.rSkillDescription = rSkillDescription;
    }

    public String getrSkillIconUrl() {
        return rSkillIconUrl;
    }

    public void setrSkillIconUrl(String rSkillIconUrl) {
        this.rSkillIconUrl = rSkillIconUrl;
    }

    public String getPassiveSkillName() {
        return passiveSkillName;
    }

    public void setPassiveSkillName(String passiveSkillName) {
        this.passiveSkillName = passiveSkillName;
    }

    public String getPassiveSkillDescription() {
        return passiveSkillDescription;
    }

    public void setPassiveSkillDescription(String passiveSkillDescription) {
        this.passiveSkillDescription = passiveSkillDescription;
    }

    public String getPassiveSkillIconUrl() {
        return passiveSkillIconUrl;
    }

    public void setPassiveSkillIconUrl(String passiveSkillIconUrl) {
        this.passiveSkillIconUrl = passiveSkillIconUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
