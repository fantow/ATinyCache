package com.fantow.ioc.xml;


import org.dom4j.Document;
import org.dom4j.Element;

import java.util.Collection;

public interface IElementContainer {
    void addElements(Document doc);

    Element getElement(String id);

    Collection<Element> getElements();
}
