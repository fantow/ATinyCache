package com.fantow.ioc.context;

import com.fantow.ioc.xml.ElementContainerImpl;
import com.fantow.ioc.xml.IDocumentHolder;
import com.fantow.ioc.xml.IElementContainer;
import com.fantow.ioc.xml.XmlDocumentHolder;

import java.util.HashMap;
import java.util.Map;

public class AbstractAppContext implements IAppContext {

    protected IElementContainer elementContainer = new ElementContainerImpl();

    protected IDocumentHolder documentHolder = new XmlDocumentHolder();

    // IOC的实现
    protected Map<String,Object> beans = new HashMap<String, Object>();

    protected IPropertyHandler propertyHandler = new PropertyHandlerImpl();





    public Object getBean(String id) {
        return null;
    }

    public boolean containsBean(String id) {
        return false;
    }

    public boolean isSingleton(String id) {
        return false;
    }

    public Object getBeanIgnoreCreate(String id) {
        return null;
    }
}
