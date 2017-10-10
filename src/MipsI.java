public class MipsI{

	public static String opcodeI(String[] partes){
		
		if(partes[0].equals("addi")){ 
			return "001000";
		}
		else if(partes[0].equals("addiu")){
			return "001001";
		}
		else if (partes[0].equals("andi")){
			return "001100";
		}
		else if (partes[0].equals("beq")){ // label
			return "001000";
		}
		else if (partes[0].equals("bne")){ // label
			return "000101";
		}
		else if (partes[0].equals("lw")){ // offset
			return "100010";
		}
		else if (partes[0].equals("ori")){
			return "001101";
		}
		else if (partes[0].equals("slti")){
			return "001010";
		}
		else if (partes[0].equals("sltiu")){
			return "001011";
		}
		else if (partes[0].equals("sw")){ // offset
			return "000010";
		}
		return "Erro";
	} 

	
}