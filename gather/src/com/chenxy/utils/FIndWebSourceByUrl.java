package com.chenxy.utils;

import sun.net.www.protocol.http.HttpURLConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @version 1.0
 * @author admin
 * @since 1.0
 * @desc  抓取网页的源代码
 */
public class FIndWebSourceByUrl {

    public static final String findWebSourceByUrl(String webUrl) throws IOException {
        StringBuffer stringBuffer=null;
        HttpURLConnection urlConnection=null;
        InputStream inputStream=null;
        try {
            stringBuffer = new StringBuffer();
            //http://finance.sina.com.cn/money/lczx/2016-09-27/details-ifxwevmc5601763.shtml
            if(!webUrl.toLowerCase().startsWith("http://")){
                webUrl="http://"+webUrl;
            }
            URL url=new URL(webUrl);
            urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setConnectTimeout(60000);//60000ms 1min
            urlConnection.setReadTimeout(60000);
            int responseCode=urlConnection.getResponseCode();
            if(!(200==responseCode)){
                System.out.println("webUrl请求失败:responseCode="+responseCode);
                return null;
            }
            inputStream = urlConnection.getInputStream();
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
            String str=null;
            while((str=bufferedReader.readLine())!=null)
                  stringBuffer.append(str);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
             inputStream.close();
             urlConnection.disconnect();
        }
        return stringBuffer.toString();
    }


}
