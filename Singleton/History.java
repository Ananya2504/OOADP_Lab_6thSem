import java.io.*;
public class History {
    private static History h;
    private History(){}
    public static History getInstance(){
        if(h == null){
            h = new History();
        }
        return h;
    }
    public void writeHistory(String url){
        try{
           PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("Hist.txt",true)));
           out.println(url);
           out.close();
        }
        catch(Exception e){
            System.out.println("Could not open file");
        }
    }
}
