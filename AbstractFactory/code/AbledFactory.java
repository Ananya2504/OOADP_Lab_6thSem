public class AbledFactory implements Games {

	public OutdoorAdv getOutdoorAdventureSports(String name) {
		// TODO Auto-generated method stub
		if(name.equalsIgnoreCase("Bungee Jumping"))
			return new BungeeAbled();
		else if(name.equalsIgnoreCase("Paragliding"))
			return new ParaAbled();
		else if(name.equalsIgnoreCase("Trekking"))
			return new TrekAbled();
		else
			return null;
	}

	public OutdoorReg getOutdoorRegularGames() {
		// TODO Auto-generated method stub
		return new CricketAbled();
	}

	public IndoorReg getIndoorRegularGames() {
		// TODO Auto-generated method stub
		return new TTAbled();
	}

}