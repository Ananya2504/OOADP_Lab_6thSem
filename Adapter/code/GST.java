public class GST implements CalcTax{
	public double taxAmount(int quant,double price) {
		return quant*price*0.18;
	}
}
