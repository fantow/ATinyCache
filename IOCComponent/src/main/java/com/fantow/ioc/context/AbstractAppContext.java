package com.fantow.ioc.context;

public class AbstractAppContext implements IAppContext {

    protected IElementContainer elementContainer = new ElementContainerImpl();




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
