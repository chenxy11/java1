package com.chenxy.economy;

import com.chenxy.utils.FIndWebSourceByUrl;
import com.chenxy.utils.FindBasicInfoByWebSource;
import com.chenxy.utils.SinaEconomyAllColumn;

import java.io.IOException;

/**
 * Created by admin on 2016/9/27.
 */
public class Main {

    public static void main(String[] args){
        //todo 新浪
        try {
//              String s= FIndWebSourceByUrl.findWebSourceByUrl("http://finance.sina.com.cn/money/lczx/2016-09-27/details-ifxwevmc5601763.shtml");
//            String title=FindBasicInfoByWebSource.findBasicInfoByRegex(s,FindBasicInfoByWebSource.TITLE_REGEX);
//            String times=FindBasicInfoByWebSource.findBasicInfoByRegex(s,FindBasicInfoByWebSource.TIME_REGEX);
//              String text=FindBasicInfoByWebSource.findBasicInfoByRegex(s,FindBasicInfoByWebSource.TEXT_REGEX);
//              String keywords=FindBasicInfoByWebSource.findBasicInfoByRegex(s,FindBasicInfoByWebSource.KEYWORDS_REGEX);
//              String commentCount=FindBasicInfoByWebSource.findBasicInfoByRegex(s,FindBasicInfoByWebSource.COMMENT_COUNT_REGEX);
//            System.out.println(title);
//            System.out.println(times);
//              System.out.println(text);
//              System.out.println(keywords);
//            System.out.println(commentCount);
              FindBasicInfoByWebSource.findNewsUrl(SinaEconomyAllColumn.ECONOMY_STOCK);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
