package juit.utils;

import java.io.*;

public class FileIO {
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;
    String inPath,outPath;
    public void copyContentsOfFile(File in,File out)
    {
        try {
            bufferedReader = new BufferedReader(new FileReader(inPath));
            bufferedWriter = new BufferedWriter(new FileWriter(outPath));
            String data;
            while((data = bufferedReader.readLine()) != null)
            {
                bufferedWriter.write(data+"\n");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void createFolder(String FolderName,String path)
    {
        String temp = path+"\\"+FolderName;
        File theDir = new File(temp);
        if (!theDir.exists()){
            theDir.mkdirs();
        }
    }
    public void write(String input,String pathOfFile)
    {
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(pathOfFile));
            bufferedWriter.write(input+"\n");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void read(String pathOfFile)
    {
        try {
            bufferedReader = new BufferedReader(new FileReader(pathOfFile));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public  void setInPath(String inPath)
    {
        this.inPath = inPath;
    }
    public void setOutPath(String outPath)
    {
        this.outPath = outPath;
    }

}
