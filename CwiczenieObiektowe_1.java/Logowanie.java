class Logowanie{
	private String login = "akronim";
	private String haslo = "123ASDlo9";
	
	@Override
	public String toString(){
		return "Samochód:\n"
		+"Marka: "+marka+"\n"
		+"Model: "+model+"\n"
		+"Rodzaj silnika: "+rodzaj_silnika+"\n"
		+"Moc: "+moc+"\n"
		+"Moment obrotowy: "+mo_obrotowy+"\n"
		+"Pojemność: "+pojemnosc+"\n";
	}
}