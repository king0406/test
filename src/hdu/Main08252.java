package hdu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main08252 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<UnilateralLine> lineList = new ArrayList<UnilateralLine>();
        while (scanner.hasNextLine()) {
            String[] options = scanner.nextLine().split(";");
            if (options.length < 5) {
                break;
            }
            lineList.add(new UnilateralLine(options[0], options[1], options[2], options[3], options[4], options[5]));
        }
        scanner.close();
        for(int i=0;i<lineList.size();i++){
        	for(int j=i+1;j<lineList.size();j++){
        		
        	}
        }
        // wirte your code here
        List<String> result = calculateUnilateral(lineList);

        for (String str : result) {
            System.out.println(str);
        }
    }
    public static List<String> calculateUnilateral(List<UnilateralLine> lineList) {
        List<String> result = new ArrayList<String>();
        return result;
    }
public static class UnilateralLine {
private String id;
private String sCen;//�����ֲ�
private String sPro;//����ʡ
private String eCen;//����ֲ�
private String ePro;//����ʡ
//9.6m/17.5m
private String tType;//����
public UnilateralLine(String id, String sCen, String sPro, String eCen, String ePro,String tType) {
            this.id = id;this.sCen = sCen;this.sPro = sPro;this.eCen = eCen;this.ePro = ePro;this.tType = tType;}
public String getId() {return id;}
public void setId(String id) {this.id = id;}
public String getSCen() {return sCen;}
public void setSCen(String ePro) {this.ePro = ePro;}
public String getSPro() {return sPro;}
public void setSPro(String sPro) {this.sPro = sPro;}
public String getECen() {return eCen;}
public void setECen(String eCen) {this.eCen = eCen;}
public String getEPro() {return ePro;}
public void setEPro(String ePro) {this.ePro = ePro;}
public String getTType() {return tType;}
public void setTType(String tType) {this.tType = tType;}
}
}