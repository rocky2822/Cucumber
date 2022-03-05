package org.bank;

public class BankInfo extends AxisBank {
private void saving() {
System.out.println("Savings account");
}
private void fixed() {
System.out.println("Fixed account");
}
public static void main(String[] args) {
	BankInfo binfo = new BankInfo();
	binfo.saving();
	binfo.fixed();
	binfo.deposit();
}
}
