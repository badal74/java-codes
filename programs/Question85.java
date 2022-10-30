import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample {
    public static void main(String[] args)throws Exception {
        String sDate = "30/10/2022";
        Date date=new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
        System.out.println(sDate+"\t"+date);
    }
}