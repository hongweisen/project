package com.commons.project.comm.aop;

import java.lang.annotation.*;

/**
 * @Description: 日志注解
 * @author Vision
 * @date 2018年5月17日  下午19:34:57
 * @version 1.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerManage {

	public String description();
}
