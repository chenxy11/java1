package com.chenxy.utils.inter;

import com.chenxy.utils.basedata.BaseEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/9/29.
 */
public interface FenxiData<E extends BaseEntity> {
    public List<E> fenxiListData(List<E> list);
    public Map fenxiMapData(Map map);
}
