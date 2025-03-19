package com.lab3.task2;

public class ReportCreator extends DocumentCreator {
    @Override
    public void addContent(Document document) {
        document.content = "Report content";
    }
}

