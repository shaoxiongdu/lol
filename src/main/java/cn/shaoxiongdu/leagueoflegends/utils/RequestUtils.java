package cn.shaoxiongdu.leagueoflegends.utils;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * @description:
 * @author: shaoxiongdu <email@shaoxiongdu.cn>
 * @date: 2021-10-23 | 15:11
 */
public class RequestUtils {


    /**
     * 发送请求
     * @param URL
     * @return
     * @throws Exception
     */
    public static String sendRequest(String URL) throws Exception {

        StringBuilder stringBuilder = new StringBuilder();
        //拼接网络请求地址
        URL url = new URL(URL);

        //发送请求
        URLConnection urlConnection = url.openConnection();

        //获取响应流
        InputStream resultInputStream = urlConnection.getInputStream();

        //字节流包装字符走码表
        InputStreamReader inputStreamReader = new InputStreamReader(resultInputStream,"UTF-8");

        //字符缓冲
        char [] buffer = new char[2 << 12];

        //读取长度
        int length = 0;

        //循环读取包装好的字符流
        while ((length = inputStreamReader.read(buffer)) != -1){

            //将unicode转为正常汉字
            String unicode = UicodeBackslashU.unicodeToCn(new String(buffer, 0, length));

            //拼接到结果中
            stringBuilder.append(unicode);

        }


        String result = stringBuilder.toString();

        //去除结果中的'\'字符
        result = result.replaceAll("\\\\", "");

        return result;
    }

}
