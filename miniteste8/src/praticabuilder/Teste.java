package praticabuilder;

import org.junit.jupiter.api.Test;

public class Teste {
	@Test
	
 void Test1() {
	Produto smartphone = new Produto("Samsung",999.00);
	Produto Headset = new Produto("Sony",59.90);
	Venda venda1 = new VendaBuilder()
			.Data("12/03/2020")
			.ClientePj("João Francisco","036-450-111")
			.item(5, smartphone)
			.item(3,Headset)
			.Funcionario("José")
			.Build();
	

}
	@Test
	void Test2() {
		Produto Feijao = new Produto("Feijao",3.50);
		Produto Arroz = new Produto("Arroz",2.50);
		Produto Macarrao = new Produto("Macarrao",1.95);
		Venda venda2 = new VendaBuilder()
				.Data("13/03/2020")
				.ClientePf("José Soares", "115.462.685.66")
				.item(15, Feijao)
				.item(25, Arroz)
				.item(10, Macarrao)
				.Funcionario("Irineu")
				.Build();
	}
}
