package cn.shaoxiongdu.leagueoflegends.utils;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-16 | 22:04
 */
public class FormatUtils {

    /**
     * 将字符串转化为Integer
     * @param string
     * @param defaultValue 默认值
     * @return 无法转化时返回默认值
     */
    public static Integer string2Integer(String string,Integer defaultValue){

        Integer integer = null;

        try {
            integer = Integer.parseInt(string);
        }catch (Exception e){
            integer = defaultValue;
        }
        return integer;
    }

}
