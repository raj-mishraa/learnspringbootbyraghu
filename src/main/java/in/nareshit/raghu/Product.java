package in.nareshit.raghu;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//import lombok.Getter;
//import lombok.Setter;
@ConfigurationProperties(prefix="my.value")
//ctrl+shift+O 
@Component("pob")
//@Setter
//@Getter
public class Product {
//	@Value("5")
	private int pid;
public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPcode() {
		return pcode;
	}


	public void setPcode(String pcode) {
		this.pcode = pcode;
	}


	//	@Value("PEN")
	private String pcode;
	
	
	public void display() {
		System.out.println(pid + "-" + pcode);
	}
}
