public class MTAdapter implements CalcTax{
	private MauritiusTax mt;
	MTAdapter(){
		mt=new MauritiusTax();
	}
    public double taxAmount(int quant,double price) {
    	return mt.mauritiusTaxAmount(quant, price);
    }
}
