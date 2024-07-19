package utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MassaDeDados {

	String caminhoArquivoExcel = "src/test/resources/testData/massateste.lsx";

	public String inserirCep() {

		try {
			FileInputStream arquivo = new FileInputStream(new File(caminhoArquivoExcel));
			// abre o arquivo excel e cria uma instância de planilha
			Workbook planilha = new XSSFWorkbook(arquivo);

			// seleciona a primeira planilha
			org.apache.poi.ss.usermodel.Sheet abaPlanilha = planilha.getSheetAt(0);

			for (Row linha : abaPlanilha) {

				Cell celula = linha.getCell(0); // obtem a primeira célula da linha

				// verifica o tipo da célula
				switch (celula.getCellType()) {
				case STRING:
					// se for uma célula de texto,retorna o valor como cep
					return celula.getStringCellValue();
				case NUMERIC:
					return String.valueOf((int) celula.getNumericCellValue());
				}

			}
		} catch (Exception e) {
			System.out.println("Erro ao ler planilha");
		}

		return null;

	}

}
