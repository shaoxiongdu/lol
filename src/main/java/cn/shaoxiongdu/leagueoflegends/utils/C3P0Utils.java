package cn.shaoxiongdu.leagueoflegends.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-12 | 19:50
 */
public class C3P0Utils {

    private static final ComboPooledDataSource cpds = new ComboPooledDataSource("c3p0-config");

    /**
     * 获取数据库连接
     * @return
     */
    public static Connection getConnection(){
        try {
            return cpds.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 关闭连接
     * @param connection
     */
    public static void close(Connection connection){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
