package com.natalframework.screenplay.questions.tablas;

import net.serenitybdd.screenplay.Question;

import java.io.File;


public class ArchivoDescargado {


    public static Question<Boolean> es() {

        File folder = new File("C:/SerenityBrowserDownloads");
        File[] listOfFiles = folder.listFiles();
        if (listOfFiles.length == 1) {
            return actor -> true;
        } else
            return actor -> false;


    }
}

