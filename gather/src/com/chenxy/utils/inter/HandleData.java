package com.chenxy.utils.inter;

import com.chenxy.utils.basedata.BaseEntity;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/9/29.
 */
public interface HandleData<E extends BaseEntity> {

    public   List<E>  handleListData(List<E> list);
    public   Map handleMapData(Map list);


}
