public class DiffAbledFactory implements Games{
	public OutdoorAdv getOutdoorAdventureSports(String name) {
		if(name.equalsIgnoreCase("Bungee Jumping"))
			return new BungeeDiffAbled();
		else if(name.equalsIgnoreCase("Paragliding"))
			return new ParaDiffAbled();
		else if(name.equalsIgnoreCase("Trekking"))
			return new TrekDiffAbled();
		else
			return null;
	}
	public OutdoorReg getOutdoorRegularGames() {
		return new CricketDiffAbled();
	}
	public IndoorReg getIndoorRegularGames() {
		return new TTDiffAbled();
	}

}
