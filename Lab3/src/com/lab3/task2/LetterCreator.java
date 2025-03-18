package com.lab3.task2;

public class LetterCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        var res = new Document();
        res.header = "Default Header";
        res.content = "Letter content";
        res.creator = "People";
        return res;
    }
}
