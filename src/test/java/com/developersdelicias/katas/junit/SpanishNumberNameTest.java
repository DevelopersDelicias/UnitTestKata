package com.developersdelicias.katas.junit;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(JUnitParamsRunner.class)
public class SpanishNumberNameTest {

	@Test
	@Parameters
	@TestCaseName("Name of {0} is {1}")
	public void can_say_its_name(int number, String expectedName) {
		assertThat(
				String.format("Name of %d should be %s", number, expectedName),
				nameOf(number),
				is(expectedName)
		);
	}

	@SuppressWarnings("unused")
	private Object parametersForCan_say_its_name() {
		return new Object[][]{
				new Object[]{0, "Cero"},
				new Object[]{1, "Uno"},
				new Object[]{2, "Dos"},
				new Object[]{3, "Tres"},
				new Object[]{4, "Cuatro"},
				new Object[]{5, "Cinco"},
				new Object[]{6, "Seis"},
				new Object[]{7, "Siete"},
				new Object[]{8, "Ocho"},
				new Object[]{9, "Nueve"},
				new Object[]{10, "Diez"},
				new Object[]{11, "Once"},
				new Object[]{12, "Doce"},
				new Object[]{13, "Trece"},
				new Object[]{14, "Catorce"},
				new Object[]{15, "Quince"},
				new Object[]{16, "Dieciséis"},
				new Object[]{17, "Diecisiete"},
				new Object[]{18, "Dieciocho"},
				new Object[]{19, "Diecinueve"},
				new Object[]{20, "Veinte"},
				new Object[]{21, "Veintiuno"},
				new Object[]{22, "Veintidós"},
				new Object[]{23, "Veintitrés"},
				new Object[]{24, "Veinticuatro"},
				new Object[]{25, "Veinticinco"},
				new Object[]{26, "Veintiséis"},
				new Object[]{27, "Veintisiete"},
				new Object[]{28, "Veintiocho"},
				new Object[]{29, "Veintinueve"},
				new Object[]{30, "Treinta"},
				new Object[]{31, "Treinta y uno"},
				new Object[]{32, "Treinta y dos"},
				new Object[]{33, "Treinta y tres"},
				new Object[]{34, "Treinta y cuatro"},
				new Object[]{35, "Treinta y cinco"},
				new Object[]{36, "Treinta y seis"},
				new Object[]{37, "Treinta y siete"},
				new Object[]{38, "Treinta y ocho"},
				new Object[]{39, "Treinta y nueve"},
				new Object[]{40, "Cuarenta"},
				new Object[]{41, "Cuarenta y uno"},
				new Object[]{42, "Cuarenta y dos"},
				new Object[]{43, "Cuarenta y tres"},
				new Object[]{44, "Cuarenta y cuatro"},
				new Object[]{45, "Cuarenta y cinco"},
				new Object[]{46, "Cuarenta y seis"},
				new Object[]{47, "Cuarenta y siete"},
				new Object[]{48, "Cuarenta y ocho"},
				new Object[]{49, "Cuarenta y nueve"},
				new Object[]{50, "Cincuenta"},
				new Object[]{51, "Cincuenta y uno"},
				new Object[]{52, "Cincuenta y dos"},
				new Object[]{53, "Cincuenta y tres"},
				new Object[]{54, "Cincuenta y cuatro"},
				new Object[]{55, "Cincuenta y cinco"},
				new Object[]{56, "Cincuenta y seis"},
				new Object[]{57, "Cincuenta y siete"},
				new Object[]{58, "Cincuenta y ocho"},
				new Object[]{59, "Cincuenta y nueve"},
		};
	}

	private String nameOf(int value) {
		return SpanishNumberName.of(value).name();
	}
}
