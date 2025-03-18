package com.lab3.task2;

public class ReportCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        var res = new Document();
        res.header = "Default Header";
        res.content = "Report content";
        res.creator = "Auto";
        return res;
    }
}

