package com.fantow.ioc.beans.factory;

public class XmlBeanFactory extends AbstractAppContext{
    public XmlBeanFactory(String[] xmlPaths){
        super.setUpElements(xmlPaths);
    }
}
