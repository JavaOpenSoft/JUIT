package juit.utils;
import java.io.File;

public class Files {
    java.io.File file;
    public Files(String pathOfFile,String NameOfFile)
    {
        pathOfFile = pathOfFile+"//"+NameOfFile;
        file = new java.io.File(pathOfFile);
    }
}
