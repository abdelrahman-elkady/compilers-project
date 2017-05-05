
public class Container {
	public String val, assem, thenL, elseL;
	public boolean flag;
	public Container(){
	}
	public Container(String val, String assem) {
		this.val = val;
		this.assem = assem;
		thenL = "";
		elseL = "";
		flag = false;
	}
	public String getVal() {
		return val;
	}
	public String getAssem() {
		return assem;
	}
	public void raiseFlag() {
		this.flag = true;
	}
	public String getThenL() {
		return thenL;
	}
	public void setThenL(String thenL) {
		this.thenL = thenL;
	}
	public String getElseL() {
		return elseL;
	}
	public void setElseL(String elseL) {
		this.elseL = elseL;
	}
}
