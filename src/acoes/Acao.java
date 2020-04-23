package acoes;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import geradores.Gerador;
import geradores.PopulaGerador;
import menus.PopulaMenu;

public class Acao {

	public void iniciaAcao() {
		PopulaMenu populaMenu = new PopulaMenu();
		PopulaGerador populaGerador = new PopulaGerador();
		populaGerador.addToList();
		populaMenu.addToList();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Selecione uma opção:\n");

		populaMenu.getMenu().forEach(menu -> System.out.println(menu.toString()));

		Integer numeroAcao = scanner.nextInt();
		executarAcao(numeroAcao, populaGerador.getLista(), scanner);
	}

	public void executarAcao(Integer id, List<Gerador> populaGerador, Scanner scanner) {
		if (id.equals(1)) {
			System.out.println("Informe o nome do Gerador");
		}

		if (id.equals(2)) {
			System.out.println("Status dos Geradores");
			populaGerador.forEach(gerador -> System.out
					.println(gerador.getNome() + "-" + (gerador.getStatus() ? "Ligado" : "Desligado")));
			iniciaAcao();
		}

		if (id.equals(3)) {
			System.out.println("Status dos Tanques");
			populaGerador.forEach(gerador -> {
				Integer capacidadeDisponivel = gerador.getUsoCapacidade() == 0 ? 0
						: gerador.getCapacidadeTotal() - gerador.getUsoCapacidade();
				if ((capacidadeDisponivel / gerador.getUsoCapacidade()) < 0.2) {
					System.out.println(
							gerador.getUsoCapacidade() + "/" + gerador.getCapacidadeTotal() + " (ABASTECER)\n");
				} else {
					System.out.println(gerador.getUsoCapacidade() + "/" + gerador.getCapacidadeTotal());
				}
			});
			iniciaAcao();
		}

		if (id.equals(4)) {
			System.out.print("Nome do Gerador: ");
			String nomeGerador = scanner.next();
			System.out.print("Quantidade de Litros de Combustível: ");
			Integer quantidadeLitros = scanner.nextInt();

			Optional<Gerador> optionalGerador = populaGerador.stream()
					.filter(gerador -> gerador.getNome().toLowerCase().equals(nomeGerador.toLowerCase())).findFirst();

			if (!optionalGerador.isPresent()) {
				System.out.println("Gerador não encontrado.\n");
			}

			Gerador geradorAbastecer = optionalGerador.get();

			Integer capacidadeDisponivel = geradorAbastecer.getUsoCapacidade() == 0 ? 0
					: geradorAbastecer.getCapacidadeTotal() - geradorAbastecer.getUsoCapacidade();

			if (quantidadeLitros > capacidadeDisponivel) {
				System.out.println("\nUltrapassou a capacidade máxima do gerador.");
				System.out.println("\nCapacidade disponível: " + capacidadeDisponivel + "\n");
			} else {
				System.out.println("Combustível adicionado com sucesso.\n");
			}
			iniciaAcao();
		}

		if (id.equals(5)) {
			populaGerador.forEach(gerador -> System.out.println(gerador.toString()));
			iniciaAcao();
		}

		if (id.equals(6)) {
			scanner.close();
		}
	}
}
