CREATE TABLE hero
(
    /**
     * 英雄ID
     */
    id                      varchar(200),
/**
 * 名称
 */
    name                    varchar(200),

    /**
     * 称号
     */
    title                   varchar(200),

    /**
     *  英文名
     */
    englishName             varchar(200),

    /**
     *  背景故事
     */
    story                   varchar(2000),

    /**
     * 物理攻击
     */
    attack                  double,

    /**
     * 防御能力
     */
    defense                 double,

    /**
     * 魔法攻击
     */
    magic                   double,

    /**
     * 上手难度
     */
    difficulty              double,

    /**
     * 初始血量
     */
    hp                      double,

    /**
     * 移动速度
     */
    moveSpeed               double,

    /**
     * 攻击范围
     */
    attackRange             double,

    /**
     * 攻速
     */
    attackSpeed             double,

    /**
     *  友军提示
     */
    allyTips                varchar(2000),

    /**
     * 敌军提示
     */
    enemyTips               varchar(2000),

    /**
      头像
     */
    avatarURL               varchar(200),

    /**
     * e技能名称
     */
    eSkillName              varchar(200),

    /**
     * e技能描述
     */
    eSkillDescription       varchar(2000),

    /**
     * e技能图标
     */
    eSkillIconUrl           varchar(200),


    /**
     * q技能名称
     */
    qSkillName              varchar(200),

    /**
     * q技能描述
     */
    qSkillDescription       varchar(2000),

    /**
     * q技能图标
     */
    qSkillIconUrl           varchar(200),

    /**
     * w技能名称
     */
    wSkillName              varchar(200),

    /**
     * w技能描述
     */
    wSkillDescription       varchar(2000),

    /**
     * w技能图标
     */
    wSkillIconUrl           varchar(200),

    /**
     * r技能名称
     */
    rSkillName              varchar(200),

    /**
     * r技能描述
     */
    rSkillDescription       varchar(2000),

    /**
     * r技能图标
     */
    rSkillIconUrl           varchar(200),

    /**
     * 被动技能名称
     */
    passiveSkillName        varchar(200),

    /**
     * 被动技能描述
     */
    passiveSkillDescription varchar(2000),

    /**
     * 被动技能图标
     */
    passiveSkillIconUrl     varchar(200),

    /**
     * 数据版本
     */
    version                 varchar(200)
) DEFAULT CHARSET = 'UTF8';