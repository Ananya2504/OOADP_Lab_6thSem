public abstract class SportStock extends GetCurrentStock {
	public GetCurrentStock basicstock = new BasicStock();
	SportStock(){
		basicstock.stock();
	}
	public abstract void stock();
}