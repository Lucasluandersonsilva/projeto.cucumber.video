package projeto.cucumber.video.config;

import org.openqa.selenium.chrome.ChromeDriver;

import projeto.cucumber.video.driver.DriversConexao;

public class InicializarTeste extends DriversConexao {
	
	static String ambiente = "https://www.correios.com.br"; 
	
	public static void configurarAmbiente() {
		driver = new ChromeDriver();
		driver.get(ambiente);
		driver.manage().window().maximize();
	}
	
	public static void encerrarTeste() {
		driver.quit();
	}

}
