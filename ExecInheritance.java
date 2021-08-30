package week3day2;

public class ExecInheritance {

	public static void main(String[] args) {
		calcIndividualTax calcIn = new calcIndividualTax();
		calcIn.calcdeductions("Ram", 232.30, 212.0);
		calcIn.calcGrossIncome("Raja", 3443.330, 909.34, 340);
		calcIn.CalcTaxAndPublishValue();
		calcIn.commonmethod();
		calcIn.getStudentInfo("Raji", 0);
	}

}
