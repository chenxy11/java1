package com.chenxy.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @since 1.0
 * @see FIndWebSourceByUrl
 * @author admin
 * @version 1.0
 * @desc 通过网页源代码抓取基本信息
 */
public class FindBasicInfoByWebSource {

    public static final String TITLE_REGEX="<title>(.*?)</title>";
    //<title>9月27日在售高收益银行理财产品一览|银行理财|理财产品_新浪财经_新浪网</title>
//    2016年09月27日07:54
    public static final String TIME_REGEX="<span class=\"time-source\">(.*?)</span>";//[0-9]{4}
//<p>　　新浪财经汇总9月26日在售高收益银行理财产品：今日在售预期年化收益率在5%（含）以上的银行理财产品共7款。紫金农商银行发行的“紫金财富鑫享盈160142期人民币理财产品”预期年化收益率最高，为6%。</p>
    public static final String TEXT_REGEX="<p>(\\W*?)</p>";

    public static final String KEYWORDS_REGEX="<div class=\"article-keywords\" data-sudaclick=\"art_keywords\">(.*?)</div>";

    public static final String COMMENT_COUNT_REGEX="<span id=\"commentCount1\">(.*?)</span>";

    public static final String NEWS_URL_REGEX= "<a target=\"_blank\" href=\"(.*?)\">(.*?)</a>";


    /**
     * @param columnUrl   栏目url
     * @return  新闻链接的集合
     */
    public static final Map<String,String>  findNewsUrl(String columnUrl){
        try {
            return findNewsUrlByRegex(FIndWebSourceByUrl.findWebSourceByUrl(columnUrl), NEWS_URL_REGEX);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Map<String,String> findNewsUrlByRegex(String webSource, String newsUrlRegex) {
        Map<String,String> returnVal=new HashMap<>();
        Pattern pattern=Pattern.compile(newsUrlRegex);
        Matcher matcher=pattern.matcher(webSource);
        while(matcher.find()){
                System.out.println(matcher.group(1));
                System.out.println(matcher.group(2));
                returnVal.put(matcher.group(1),matcher.group(2));
        }
        return returnVal;
    }

    /**
     * @since 1.0
     * @param webSource
     * @param regex
     * @return
     */
    public static final String findBasicInfoByRegex(String webSource,String regex){
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(webSource);
        String returnVal="";
        while(matcher.find()){
             returnVal+=matcher.group(1);
        }
        if(returnVal.contains("<span>文章关键词：</span>")){
            returnVal=returnVal.replace("<span>文章关键词：</span>", "");
//            return findBasicInfoByRegex(returnVal,"<a href=\"(.*?)\" target=\"_blank\">(.*?)</a>");
        }
        return returnVal;
    }

}
