import java.util.Locale;
import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			double RendaAnual, PrestacaoServico, GanhoCapital, GastosMedicos, GastosEducacionais,
				ImpostoSalario, ImpostoServicos, ImpostoGanhoCapital, MaximoDedutivel, GastosDedutiveis,
				ImpostoBruto, Abatimento, ImpostoDevido;
			
			System.out.print("Renda anual com salário: ");
			RendaAnual = sc.nextDouble();
			
			System.out.print("Renda anual com prestação de serviço: ");
			PrestacaoServico = sc.nextDouble();
			
			System.out.print("Renda anual com ganho de capital: ");
			GanhoCapital = sc.nextDouble();
			
			System.out.print("Gastos médicos: ");
			GastosMedicos = sc.nextDouble();
			
			System.out.print("Gastos educacionais: ");
			GastosEducacionais = sc.nextDouble();

			
			ImpostoSalario = 0;
			ImpostoDevido = 0;
			
			if (RendaAnual/12 >= 5000) {
				ImpostoSalario = RendaAnual * 0.2;
			} else if (RendaAnual/12 >= 3000 && RendaAnual/12 < 5000) {
				ImpostoSalario = RendaAnual * 0.1;
			}
			
			ImpostoServicos = PrestacaoServico * 0.15;

			ImpostoGanhoCapital = GanhoCapital * 0.2;
			
			ImpostoBruto = ImpostoSalario + ImpostoServicos + ImpostoGanhoCapital;
			
			MaximoDedutivel = (ImpostoBruto) * 0.3;
			
			GastosDedutiveis = GastosMedicos + GastosEducacionais;
			
			if (MaximoDedutivel > GastosDedutiveis) {
				Abatimento = GastosDedutiveis;
			} else {
				Abatimento = MaximoDedutivel;
			}
			
			ImpostoDevido = ImpostoBruto - Abatimento;

			
			System.out.println("\nRELATÓRIO DE IMPOSTO DE RENDA\n");
			
			System.out.println("CONSOLIDADO DE RENDA:\n");
			System.out.printf("Imposto sobre salário: %.2f", ImpostoSalario);
			System.out.printf("\nImposto sobre servicos:  %.2f", ImpostoServicos);
			System.out.printf("\nImposto sobre ganho de capital: %.2f", ImpostoGanhoCapital);
			
			System.out.println("\n\nDEDUCOES:");
			System.out.printf("Máximo dedutível: %.2f", MaximoDedutivel);
			System.out.printf("\nGastos dedutíveis: %.2f", GastosDedutiveis);
			
			System.out.println("\n\nRESUMO:\n");
			System.out.printf("Imposto bruto total: %.2f", ImpostoBruto);
			System.out.printf("\nAbatimento: %.2f", Abatimento);
			System.out.printf("\nImposto devido: %.2f", ImpostoDevido);
		
		sc.close();
	}

}