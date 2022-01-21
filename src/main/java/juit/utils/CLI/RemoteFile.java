package juit.utils.CLI;

public class RemoteFile {
    private String URL1,URL2;
    public void DownloadFile(String URL){
        this.URL1 = URL;
    }
    public void readFileOnline(String URL){
        this.URL2 = URL;
    }
    public String getCurrentlyDownloadedFileURL(){
        return this.URL1;
    }
    public String getCurrentReadFile(){
        return this.URL2;
    }
}
