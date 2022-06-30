public class Male {
	
	Games ab=new AbledFactory();
	OutdoorAdv sp1=ab.getOutdoorAdventureSports("trekking");
	OutdoorReg sp2=ab.getOutdoorRegularGames();
	IndoorReg sp3=ab.getIndoorRegularGames();
	
	public void maleAbledFactory() {
		System.out.println("Male Abled");
		sp1.getSportName();
		sp2.getSportName();
		sp3.getSportName();
	}
	
	Games diffab=new DiffAbledFactory();
	OutdoorAdv dsp1=diffab.getOutdoorAdventureSports("Paragliding");
	OutdoorReg dsp2=diffab.getOutdoorRegularGames();
	IndoorReg dsp3=diffab.getIndoorRegularGames();
	
	public void maleDiffAbledFactory() {
		System.out.println("Male Diff Abled");
		dsp1.getSportName();
		dsp2.getSportName();
		dsp3.getSportName();
	}
	

}
