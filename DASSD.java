package hyd.offline.right;

 public class DASSD{
	private int id;
	private String name;
	private double fee;
	private static String org = "C-DAC Hyd";
    
    public DASSD(int id, String name, double fee){
    this.id = id;
    this.name = name;
    this.fee = fee;
    }

    void getDASSD(){
    	System.out.println("ID :"+id+"\nName: "+name+"\nFee: "+fee+"\nORG: "+org);
    }

}
