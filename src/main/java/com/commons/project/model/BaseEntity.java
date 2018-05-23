package com.commons.project.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        /**
         * ToStringBuilder 参数对应的输出格式
         * DEFAULT_STYLE : Person@fd13b5[name=watchdb,sex=1,addr=shanghai.zhangjiang]
         * MULTI_LINE_STYLE :Person@fd13b5[name=watchdb sex=1 addr=shanghai.zhangjiang]
         * NO_FIELD_NAMES_STYLE:Person@fd13b5[watchdb,1,shanghai.zhangjiang]
         * SHORT_PREFIX_STYLE : Person[name=watchdb,sex=1,addr=shanghai.zhangjiang]
         * SIMPLE_STYLE : watchdb,1,shanghai.zhangjiang **/
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
