package teste;

import java.awt.Button;
import java.awt.Frame;

public class ExemploAWT01 extends Frame {

	ExemploAWT01() {

		Button botao = new Button("Clique aqui");
		botao.setBounds(30, 100, 80, 30);

		add(botao);

		setSize(300, 300);

		setTitle("Exemplo 01 de Java Awt");

		setLayout(null);

		setVisible(true);

	}

	public static void main(String[] args) {

		ExemploAWT01 frame = new ExemploAWT01();

	}

}
