package cn.shaoxiongdu.leagueoflegends.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-15 | 17:16
 */
public class WebUtils {


    /**\
     *
     * @param c
     * @param param
     * @param <T>
     * @return
     */
    public static <T> T param2Bean(T bean,Map param){

        try {
            BeanUtils.populate(bean,param);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return bean;
    }

}
