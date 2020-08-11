package services;

public class UsaInterestService2 implements InterestService {
	
	public double interestRate;

	public UsaInterestService2(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

		
	

}
