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
				number(0, "Cero"),
				number(1, "Uno"),
				number(2, "Dos"),
				number(3, "Tres"),
				number(4, "Cuatro"),
				number(5, "Cinco"),
				number(6, "Seis"),
				number(7, "Siete"),
				number(8, "Ocho"),
				number(9, "Nueve"),
				number(10, "Diez"),
				number(11, "Once"),
				number(12, "Doce"),
				number(13, "Trece"),
				number(14, "Catorce"),
				number(15, "Quince"),
				number(16, "Dieciséis"),
				number(17, "Diecisiete"),
				number(18, "Dieciocho"),
				number(19, "Diecinueve"),
				number(20, "Veinte"),
				number(21, "Veintiuno"),
				number(22, "Veintidós"),
				number(23, "Veintitrés"),
				number(24, "Veinticuatro"),
				number(25, "Veinticinco"),
				number(26, "Veintiséis"),
				number(27, "Veintisiete"),
				number(28, "Veintiocho"),
				number(29, "Veintinueve"),
				number(30, "Treinta"),
				number(31, "Treinta y uno"),
				number(32, "Treinta y dos"),
				number(33, "Treinta y tres"),
				number(34, "Treinta y cuatro"),
				number(35, "Treinta y cinco"),
				number(36, "Treinta y seis"),
				number(37, "Treinta y siete"),
				number(38, "Treinta y ocho"),
				number(39, "Treinta y nueve"),
				number(40, "Cuarenta"),
				number(41, "Cuarenta y uno"),
				number(42, "Cuarenta y dos"),
				number(43, "Cuarenta y tres"),
				number(44, "Cuarenta y cuatro"),
				number(45, "Cuarenta y cinco"),
				number(46, "Cuarenta y seis"),
				number(47, "Cuarenta y siete"),
				number(48, "Cuarenta y ocho"),
				number(49, "Cuarenta y nueve"),
				number(50, "Cincuenta"),
				number(51, "Cincuenta y uno"),
				number(52, "Cincuenta y dos"),
				number(53, "Cincuenta y tres"),
				number(54, "Cincuenta y cuatro"),
				number(55, "Cincuenta y cinco"),
				number(56, "Cincuenta y seis"),
				number(57, "Cincuenta y siete"),
				number(58, "Cincuenta y ocho"),
				number(59, "Cincuenta y nueve"),
				number(60, "Sesenta"),
				number(61, "Sesenta y uno"),
				number(64, "Sesenta y cuatro"),
				number(67, "Sesenta y siete"),
				number(70, "Setenta"),
				number(72, "Setenta y dos"),
				number(75, "Setenta y cinco"),
				number(78, "Setenta y ocho"),
				number(80, "Ochenta"),
				number(83, "Ochenta y tres"),
				number(86, "Ochenta y seis"),
				number(90, "Noventa"),
				number(99, "Noventa y nueve"),
				number(100, "Cien"),
				number(101, "Ciento uno"),
				number(102, "Ciento dos"),
				number(103, "Ciento tres"),
				number(104, "Ciento cuatro"),
				number(127, "Ciento veintisiete"),
				number(130, "Ciento treinta"),
				number(131, "Ciento treinta y uno"),
				number(132, "Ciento treinta y dos"),
				number(145, "Ciento cuarenta y cinco"),
				number(153, "Ciento cincuenta y tres"),
				number(167, "Ciento sesenta y siete"),
				number(172, "Ciento setenta y dos"),
				number(186, "Ciento ochenta y seis"),
				number(196, "Ciento noventa y seis"),
				number(199, "Ciento noventa y nueve"),
				number(200, "Doscientos"),
				number(201, "Doscientos uno"),
				number(205, "Doscientos cinco"),
				number(210, "Doscientos diez"),
				number(211, "Doscientos once"),
				number(217, "Doscientos diecisiete"),
				number(218, "Doscientos dieciocho"),
				number(225, "Doscientos veinticinco"),
				number(238, "Doscientos treinta y ocho"),
				number(245, "Doscientos cuarenta y cinco"),
				number(256, "Doscientos cincuenta y seis"),
				number(263, "Doscientos sesenta y tres"),
				number(274, "Doscientos setenta y cuatro"),
				number(287, "Doscientos ochenta y siete"),
				number(291, "Doscientos noventa y uno"),
				number(299, "Doscientos noventa y nueve"),
				number(300, "Trescientos"),
				number(301, "Trescientos uno"),
				number(302, "Trescientos dos"),
				number(350, "Trescientos cincuenta"),
				number(399, "Trescientos noventa y nueve"),
				number(400, "Cuatrocientos"),
				number(401, "Cuatrocientos uno"),
				number(408, "Cuatrocientos ocho"),
				number(416, "Cuatrocientos dieciséis"),
				number(478, "Cuatrocientos setenta y ocho"),
				number(489, "Cuatrocientos ochenta y nueve"),
				number(498, "Cuatrocientos noventa y ocho"),
				number(500, "Quinientos"),
				number(507, "Quinientos siete"),
				number(547, "Quinientos cuarenta y siete"),
				number(599, "Quinientos noventa y nueve"),
				number(600, "Seiscientos"),
				number(658, "Seiscientos cincuenta y ocho"),
				number(700, "Setecientos"),
				number(777, "Setecientos setenta y siete"),
				number(800, "Ochocientos"),
				number(892, "Ochocientos noventa y dos"),
				number(900, "Novecientos"),
				number(915, "Novecientos quince"),
				number(999, "Novecientos noventa y nueve"),
				number(1000, "Mil"),
				number(1001, "Mil uno"),
				number(1011, "Mil once"),
				number(1099, "Mil noventa y nueve"),
				number(1100, "Mil cien"),
				number(1111, "Mil ciento once"),
				number(1230, "Mil doscientos treinta"),
				number(1327, "Mil trescientos veintisiete"),
				number(1408, "Mil cuatrocientos ocho"),
				number(1500, "Mil quinientos"),
				number(1684, "Mil seiscientos ochenta y cuatro"),
				number(1780, "Mil setecientos ochenta"),
				number(1895, "Mil ochocientos noventa y cinco"),
				number(1985, "Mil novecientos ochenta y cinco"),
				number(1999, "Mil novecientos noventa y nueve"),
		};
	}

	private Object[] number(int number, String name) {
		return new Object[]{number, name};
	}

	private String nameOf(int value) {
		return SpanishNumberName.of(value).name();
	}
}
