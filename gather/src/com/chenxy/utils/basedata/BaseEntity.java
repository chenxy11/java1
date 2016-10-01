package com.chenxy.utils.basedata;

/**
 * Created by admin on 2016/9/29.
 */
public abstract  class BaseEntity {

    private  String id;
    private  String webSite;
    private  String publishTime;
    private  String gatherTime;
    private  String keyWords;
    private  LevelData levelData;
    private String sourceUrl;

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getGatherTime() {
        return gatherTime;
    }

    public void setGatherTime(String gatherTime) {
        this.gatherTime = gatherTime;
    }

    public String getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String keyWords) {
        this.keyWords = keyWords;
    }

    public LevelData getLevelData() {
        return levelData;
    }

    public void setLevelData(LevelData levelData) {
        this.levelData = levelData;
    }
}
