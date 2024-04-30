package hyd.online;

public class DAC{
	private int id;
	private String name;
	private double fee;
	private static String org = "C-DAC Hyd";
    
    public DAC(int id, String name, double fee){
    this.id = id;
    this.name = name;
    this.fee = fee;
    }

    public void getDAC(){
    	System.out.println("ID :"+id+"\nName: "+name+"\nFee: "+fee+"\nORG: "+org);
    }

}