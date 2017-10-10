public class MipsR{
	

	public static String functR(String[] partes){
		
		if(partes[0].equals("add")){
			return "100000";
		}
		else if(partes[0].equals("addu")){
			return "100001";
		}
		else if (partes[0].equals("and")){
			return "100100";
		}
		else if (partes[0].equals("jr")){
			return "001000";
		}
		else if (partes[0].equals("nor")){
			return "100111";
		}
		else if (partes[0].equals("or")){
			return "100101";
		}
		else if (partes[0].equals("slt")){
			return "101010";
		}
		else if (partes[0].equals("sltu")){
			return "101011";
		}
		else if (partes[0].equals("sub")){
			return "100010";
		}
		else if (partes[0].equals("subu")){
			return "100011";
		}
		else if (partes[0].equals("sll")){
			return "000000";
		}
		else if (partes[0].equals("srl")){
			return "000010";
		}
		return "Erro";
	} 

	public static String shamtBinario(String[] partes){
		int num = Integer.parseInt(partes[3]);
		String binario;
		binario = Integer.toBinaryString(num);
		while (binario.length()<5){
			binario ="0"+binario;
		}
		return binario;
	}

}