public class ClinRunner {
	public static void main (String[] arg){
	final Clinic clinic  = new Clinic(10);
	clinic.addClient(0, new Client ("Brown", new Cat ("Diggy")));
	clinic.addClient(0, new Client ("Brown", new Dog ( new Animal ("Sparky"))));
	}
}