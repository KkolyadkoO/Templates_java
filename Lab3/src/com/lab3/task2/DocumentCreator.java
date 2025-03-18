package com.lab3.task2;

public abstract class DocumentCreator {
    public abstract Document createDocument();

    public Document processDocument() {
        return createDocument();
    }
}
