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
		};
	}

	private String nameOf(int value) {
		return SpanishNumberName.of(value).name();
	}
}
