import java.util.*;

public class Registradores{

	public static String getReg (String[] partes, int x){
				
		if ((partes[x].equals("$zero,"))|| (partes[0].equals("$zero")) || (partes[x].equals("$0,")) || (partes[x].equals("$0"))){
			return "00000";
		}
		if ((partes[x].equals("$at,")) || (partes[x].equals("$at"))){
			return "00001";
		}
		if ((partes[x].equals("$v0,")) || (partes[x].equals("$v0"))){
			return "00020";
		}
		if ((partes[x].equals("$v1,")) || (partes[x].equals("$v1"))){
			return "00011";
		}
		if ((partes[x].equals("$a0,")) || (partes[x].equals("$a0"))){
			return "00100";
		}
		if ((partes[x].equals("$a1,")) || (partes[x].equals("$a1"))){
			return "00101";
		}
		if ((partes[x].equals("$a2,")) || (partes[x].equals("$a2"))){
			return "00110";
		}
		if ((partes[x].equals("$a3,")) || (partes[x].equals("$a3"))){
			return "00111";
		}
		if ((partes[x].equals("$t0,")) || (partes[x].equals("$t0"))){
			return "01000";
		}
		if ((partes[x].equals("$t1,")) || (partes[x].equals("$t1"))){
			return "01001";
		}
		if ((partes[x].equals("$t2,")) || (partes[x].equals("$t2"))){
			return "01010";
		}
		if ((partes[x].equals("$t3,")) || (partes[x].equals("$t3"))){
			return "01011";
		}
		if ((partes[x].equals("$t4,")) || (partes[x].equals("$t4"))){
			return "01100";
		}
		if ((partes[x].equals("$t5,")) || (partes[x].equals("$t5"))){
			return "01101";
		}
		if ((partes[x].equals("$t6,")) || (partes[x].equals("$t6"))){
			return "01110";
		}
		if ((partes[x].equals("$t7,")) || (partes[x].equals("$t7"))){
			return "01111";
		}
		if ((partes[x].equals("$s0,")) || (partes[x].equals("$s0"))){
			return "10000";
		}
		if ((partes[x].equals("$s1,")) || (partes[x].equals("$s1"))){
			return "10001";
		}
		if ((partes[x].equals("$s2,")) || (partes[x].equals("$s2"))){
			return "10010";
		}
		if ((partes[x].equals("$s3,")) || (partes[x].equals("$s3"))){
			return "10011";
		}
		if ((partes[x].equals("$s4,")) || (partes[x].equals("$s4"))){
			return "10100";
		}
		if ((partes[x].equals("$s5,")) || (partes[x].equals("$s5"))){
			return "10101";
		}
		if ((partes[x].equals("$s6,")) || (partes[x].equals("$s6"))){
			return "10110";
		}
		if ((partes[x].equals("$s7,")) || (partes[x].equals("$s7"))){
			return "10111";
		}
		if ((partes[x].equals("$t8,")) || (partes[x].equals("$t8"))){
			return "11000";
		}
		if ((partes[x].equals("$t9,")) || (partes[x].equals("$t9"))){
			return "11001";
		}
		if ((partes[x].equals("$k0,")) || (partes[x].equals("$k0"))){
			return "11010";
		}
		if ((partes[x].equals("$k1,")) || (partes[x].equals("$k1"))){
			return "11011";
		}
		if ((partes[x].equals("$gp,")) || (partes[x].equals("$gp"))){
			return "10110";

		}
		if ((partes[x].equals("$sp,")) || (partes[x].equals("$sp"))){
			return "11101";
		}
		if ((partes[x].equals("$fp,")) || (partes[x].equals("$fp"))){
			return "11110";
		}
		String ra = "$ra,";
		if ((partes[x].equals("$ra,")) || (partes[x].equals("$ra"))){
			return "11111";
		}
		return "Erro";
	}
}




