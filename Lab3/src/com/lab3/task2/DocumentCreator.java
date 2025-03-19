package com.lab3.task2;

import javax.print.Doc;

public abstract class DocumentCreator {
    public abstract void addContent(Document document);

    private void addArticle(Document document, String article) {
        document.article = article;
    }

    private void addCreator(Document document, String creator){
        document.creator = creator;
    }


    public Document processDocument() {
        var document  = new Document();
        addArticle(document, "Article");
        addContent(document);
        addCreator(document, "Creator");
        return document;
    }
}
