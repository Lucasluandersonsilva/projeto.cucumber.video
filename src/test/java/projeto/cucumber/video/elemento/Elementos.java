package projeto.cucumber.video.elemento;

import org.openqa.selenium.By;

public class Elementos {
	public static By buscarCepEndereco = By.id("relaxation");
	public static By logradouro_Nome = By.xpath("//td[@data-th='Logradouro/Nome']");
	public static By bairro_Distrito = By.xpath("//td[@data-th='Bairro/Distrito']");
	public static By localidade_UF = By.xpath("//td[@data-th='Localidade/UF']");
	public static By cep = By.xpath("//td[@data-th='CEP']");

}
