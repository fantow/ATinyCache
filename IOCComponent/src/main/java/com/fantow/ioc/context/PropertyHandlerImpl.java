package com.fantow.ioc.context;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author chenyang270@jd.com
 * @CreateDate
 * @Version: 1.0
 */
public class PropertyHandlerImpl implements IPropertyHandler{

    // 为传入的Object对象设置参数(参数在Map中存放)
    // properties中存的应该是参数名以及参数类型Class
    public Object setProperties(Object obj, Map<String, Object> properties) {
        Class<?> clazz = obj.getClass();

        for(String key : properties.keySet()){
            String setterName = getSetterMethodName(key);
            // 参数类型
            Class<?> argClass = getClass(properties.get(key));
            Method setterMethod = getSetterMethod(clazz,setterName,argClass);

        }


        return null;
    }

    public Map<String, Method> getSetterMethodsMap(Object obj) {
        return null;
    }

    public void executeMethod(Object object, Object argBean, Method method) {

    }













    private Method getSetterMethod(Class<?> objClass,String methodName,Class<?> argClass){

        Method argClassMethod = getMethod(objClass,methodName,argClass);

        // 如果没有找到obj,methodName,argClass对应的方法，就找到所有obj下，名为methodName的方法
        if(argClassMethod == null){
            List<Method> methods = getMethods(objClass,methodName);
            Method method = findMethod(argClass,methods);



        }else{

        }

        return null;
    }

    private Method findMethod(Class<?> argClass)




    // 得到一个类中的方法需要：这个类的Class对象，方法名和参数Class类型(防止方法重载)
    private Method getMethod(Class<?> objClass,String methodName,Class<?> argClass){

        try {
            Method method = objClass.getMethod(methodName, argClass);
            return method;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<Method> getMethods(Class<?> objClass,String methodName){
        List<Method> result = new ArrayList<Method>();
        for(Method m : objClass.getMethods()){
            if(m.getName().equals(methodName)){
                Class<?>[] types = m.getParameterTypes();
                if(types.length == 1){
                    result.add(m);
                }
            }
        }
        return result;
    }

    private Class<?> getClass(Object obj){
        if (obj instanceof Integer){
            return Integer.TYPE;
        }
        else if (obj instanceof Boolean){
            return Boolean.TYPE;
        }
        else if (obj instanceof Long){
            return Long.TYPE;
        }
        else if (obj instanceof Short){
            return Short.TYPE;
        }
        else if (obj instanceof Double){
            return Double.TYPE;
        }
        else if (obj instanceof Float){
            return Float.TYPE;
        }
        else if (obj instanceof Character){
            return Character.TYPE;
        }
        else if (obj instanceof Byte){
            return Byte.TYPE;
        }
        return obj.getClass();
    }

    // 获取到property对应的setter方法名
    private String getSetterMethodName(String propertyName){
        return "set" + upperCaseFirstWord(propertyName);
    }

    private String upperCaseFirstWord(String s){
        String firstWord = s.substring(0,1);
        String upperCaseWord = firstWord.toUpperCase();
        return s.replaceFirst(firstWord,upperCaseWord);
    }
}
