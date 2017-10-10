import java.util.*;

public class ArquiteturaMips{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String comando;
		int i; 

		System.out.println("Entre com a instrucao MIPS:");
			comando=scanner.nextLine();

		String[] partes = comando.split(" ");

		int tamanho = partes.length;

		String tipo = defineTipo(partes);

		switch(tipo){
			case "j": // Tipo J
			MipsJ.tipoJ(partes);
			break;

			case "r":// Tipo R
			String[] vetR = new String[6];
			vetR[0]= "000000";
			vetR[1]= Registradores.getReg(partes,2); //RS
			vetR[2]= Registradores.getReg(partes,3); //RT
			vetR[3]= Registradores.getReg(partes,1); //RD
			vetR[5]= MipsR.functR(partes);   //funct

			// Para sll e srl
			if (vetR[5].equals("000000")|| vetR[5].equals("000010")){ // casos em que funct eh sll ou slr
				vetR[1]="00000"; // nao vai haver um RS
				vetR[2]=Registradores.getReg(partes,2); // RT
				vetR[4]=MipsR.shamtBinario(partes); //funcao para transformar em binario
				
			}
			else{
				vetR[4]="00000"; // se nao tem shamt é zero
			}

			//Imprime codigo de maquina
			System.out.println("Instrucao tipo R");
			System.out.println("OPCODE RS    RT    RD    SHAMT FUNCT ");
			for(i=0;i<=tamanho+1;i++){
				System.out.print(vetR[i]+" ");
			}

			break;

			case "i": // Tipo I
			String[] vetI = new String[4];
			vetI[0] = MipsI.opcodeI(partes);
			if ((vetI[0].equals("001000")) || (vetI[0].equals("000101"))) { // para beq e bne
				vetI[1]=Registradores.getReg(partes,1);
				vetI[2]=Registradores.getReg(partes,2);
				vetI[3]="0000101000010001";

			}
			else{
				if(vetI[0].equals("100010")){ // para lw 
					vetI[2]=Registradores.getReg(partes,1);
					String[] offset = partes[2].split("[()]"); //vai pegar o registrador de dentro dos parentes nesse caso o RS
					vetI[1]=Registradores.getReg(offset,1); // vai dizer o código do registrador

					// mudando o offset para binario:
					int decimal = Integer.parseInt(offset[0]);
					String binario;
					binario = Integer.toBinaryString(decimal);
					while (binario.length()<16){
						binario ="0"+binario;
					}
					vetI[3]=binario;
				}
				else {
					if(vetI[0].equals("000010")){ // para sw 
						vetI[1]=Registradores.getReg(partes,1);
						String[] offset = partes[2].split("[()]"); // vai pegar o registrador dentro dos parentes nesse caso o RT
						vetI[2]=Registradores.getReg(offset,1); // vai dizer o codigo desse registrador
						// muda o offset para binario
						int decimal = Integer.parseInt(offset[0]);
						String binario;
						binario = Integer.toBinaryString(decimal);
						while (binario.length()<16){
							binario ="0"+binario;
						}
						vetI[3]=binario;
					}
					else{
						vetI[1]=Registradores.getReg(partes,2);
						vetI[2]=Registradores.getReg(partes,1);

						int immidiate = Integer.parseInt(partes[3]);
						String binario;
						binario = Integer.toBinaryString(immidiate);
						while (binario.length()<16){
							binario ="0"+binario;
						}
						vetI[3]=binario;
					}
				}
				System.out.println("Instrucao tipo I");
				System.out.println("OPCODE RS    RT    IMMIDIATE ");
				for(i=0;i<4;i++){
					System.out.print(vetI[i]+" ");
				}
				break;
			}
		}
	}
	
	

	public static String defineTipo(String[] partes){
			
			if(

				partes[0].equals("add")   ||
				partes[0].equals("addu")  ||
				partes[0].equals("and")   ||
				partes[0].equals("jr")    ||
				partes[0].equals("nor")   ||
				partes[0].equals("jr")    ||
				partes[0].equals("nor")   ||
				partes[0].equals("or")    ||
				partes[0].equals("slt")   ||
				partes[0].equals("sltu")  ||
				partes[0].equals("sub")   ||
				partes[0].equals("subu")  ||
				partes[0].equals("sll")   ||
				partes[0].equals("srl")){ 
				return "r";
			}
			else{
				if (partes[0].equals("j")||partes[0].equals("jal")){
				return "j";
				}
				else{
				  return "i";
		    	}
		    }
	}
}
	
			
