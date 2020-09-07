package com.fantow.ioc.xml;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.Map;

public class XmlDocumentHolder implements IDocumentHolder{

    private Map<String,Document> docs = new HashMap<>();

    @Override
    public Document getDocument(String filePath) {
        return null;
    }

    private Document readDocument(String filePath){

        SAXReader reader = new SAXReader(true);
//        reader.setEntityResolver();

    }

}
