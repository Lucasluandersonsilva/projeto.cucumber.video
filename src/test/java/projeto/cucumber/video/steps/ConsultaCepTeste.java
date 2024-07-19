package projeto.cucumber.video.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto.cucumber.video.config.InicializarTeste;
import projeto.cucumber.video.pages.HomePage;
import utils.MassaDeDados;

public class ConsultaCepTeste {

	HomePage home = new HomePage();
	MassaDeDados massa = new MassaDeDados();

	@Before
	public void iniciarTeste() {
		InicializarTeste.configurarAmbiente();

	}

	@After
	public void finalizarTeste() {
		InicializarTeste.encerrarTeste();
	}

	@When("enviar os dados para busca")
	public void enviar_os_dados_para_busca() {

		home.buscarCepEndereco(massa.inserirCep());

	}

	@Then("validar os dados retornado")
	public void validar_os_dados_retornado() {

		home.validarDadosRetornados("Avenida dos Parques (Alphasítio)", "Tamboré", "Santana de Parnaíba/SP	",
				"06544-3000");
	}

}
