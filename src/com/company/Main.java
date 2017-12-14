package com.company;

import java.io.File;
import java.io.IOException;

import eu.printingin3d.javascad.exceptions.IllegalValueException;
import eu.printingin3d.javascad.utils.SaveScadFiles;

public class Main {

    /**
     * @param args
     * @throws IOException
     * @throws IllegalValueException
     */
    public static void main(String[] args) throws IllegalValueException, IOException {
        new SaveScadFiles(new File("C:\\Users\\andrj\\Desktop\\Laba")).
                addModel("Bosfor.scad", new Bosfor(2,1)).
                saveScadFiles();
    }
}
