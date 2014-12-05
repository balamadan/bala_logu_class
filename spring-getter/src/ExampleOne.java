import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ExampleOne implements Comparable<Object> {

	private String name;
	private String ocupt;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOcupt() {
		return ocupt;
	}
	public void setOcupt(String ocupt) {
		this.ocupt = ocupt;
	}
	public ExampleOne(String name,String ocupt){
		this.name=name;
		this.ocupt=ocupt;
	}
	public static void main(String args[]){
		List<ExampleOne> eList=new ArrayList<ExampleOne>();
		eList.add(new ExampleOne("zskd","mLla"));
		eList.add(new ExampleOne("askd","xLla"));
		eList.add(new ExampleOne("lskd","aLla"));
		Collections.sort(eList);
		for(ExampleOne el:eList){
			System.out.println("========>"+el.getName()+"========>>>"+el.ocupt);
		}
	}
	@Override
	public int compareTo(Object o) {
		ExampleOne e=(ExampleOne) o;
		
		return this.name.compareTo(e.name) ;
		
	}
}
