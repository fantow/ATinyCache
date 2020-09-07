package com.fantow.ioc.context;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * @Description:
 * @Author chenyang270@jd.com
 * @CreateDate
 * @Version: 1.0
 */
public interface IPropertyHandler {

    Object setProperties(Object obj, Map<String,Object> properties);

    Map<String, Method> getSetterMethodsMap(Object obj);

    void executeMethod(Object object,Object argBean,Method method);
}
