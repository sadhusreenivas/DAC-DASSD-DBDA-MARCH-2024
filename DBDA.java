package hyd.offline.left;

public class DBDA{
	private int id;
	private String name;
	private double fee;
	private static String org = "C-DAC Hyd";
    
    public DBDA(int id, String name, double fee){
    this.id = id;
    this.name = name;
    this.fee = fee;
    }

    public void getDBDA(){
    	System.out.println("ID :"+id+"\nName: "+name+"\nFee: "+fee+"\nORG: "+org);
    }

}
