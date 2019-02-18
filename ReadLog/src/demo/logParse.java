package demo;

import java.util.*;
import java.nio.file.*;

public class logParse {
	
	public static void main(String[] args) {
		
		try {
			List<String> lines = Files.readAllLines(Paths.get("src\\data\\file.log")); //Leitura do arquivo
				for(String line : lines) {
					line = line.replace("\"",""); //Declaração para trocar o argumento especificado por vírgula
					
					String[] result = line.split (" "); //Argumento desejado para troca(onde existir espaço, faça a troca por vírgula)
					for(String s : result)
					//Apresentação
					System.out.print(s + ", ");
					System.out.println();
					
			
	
					
			}	
		}catch (Exception e) {
			System.out.println(e.getMessage());
}
		
	}
}

//Minha tentativa baseada numa estrutura simples, de acordo com meu conhecimento básico da linguagem.
//Gostaria de ter feito com outro argumento além de "espaço", para que as palavras finais não fossem separadas por vírgula,
//além dos espaços preenchidos que não são necessários. 
//Pensando em melhorias, implementaria uma forma de pesquisa para selecionar uma informação do log em específico.
