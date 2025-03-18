package com.lab3.task2;

public class main {
    public static void main(String[] args) {
        var letter = new LetterCreator().processDocument();
        var report = new ReportCreator().processDocument();

        System.out.println(letter.toString());
        System.out.println(report.toString());
    }
}
