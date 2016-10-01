package com.chenxy.utils.common;

import com.chenxy.utils.basedata.BaseEntity;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Base64Data;

import java.util.List;

/**
 * Created by admin on 2016/9/29.
 */
public abstract class SaveData<E extends BaseEntity> {



    public abstract  void saveData(List<E> list);


}
