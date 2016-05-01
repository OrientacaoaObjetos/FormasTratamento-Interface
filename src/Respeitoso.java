
public class Respeitoso implements FormatadorNome {
	
	private Boolean masculino;
	
	public Respeitoso(Boolean masculino) {
		this.masculino = masculino;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		
		if (masculino) {
			 return "Sr. " + sobrenome;
		}
		
		 return "Sra. " + sobrenome;
	}

}
