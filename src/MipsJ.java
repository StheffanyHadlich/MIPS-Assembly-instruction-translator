public class MipsJ{
	public static void tipoJ(String[] partes){
		String j = "j";
		String jal = "jal";
		if (partes[0].equals(j)){
				System.out.println("Instrucao tipo J");
				System.out.println("OPCODE TARGET ADRESS");
				System.out.println("000010 0001000001010101010");
			}
			else{
				if(partes[0].equals(jal)){
					System.out.println("Instrucao tipo J");
					System.out.println("OPCODE TARGET ADRESS");
					System.out.println("000011 0001000001010101010");
					}
			}
	}
}