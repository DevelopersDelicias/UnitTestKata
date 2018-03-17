package com.developersdelicias.katas.junit;

import java.util.HashMap;
import java.util.Map;

public class SpanishNumberName {
	private final int value;

	private static final Map<Integer, String> NUMBER_NAMES = createNumberNamesMap();

	private static Map<Integer, String> createNumberNamesMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "Cero");
		map.put(1, "Uno");
		map.put(2, "Dos");
		map.put(3, "Tres");
		map.put(4, "Cuatro");
		map.put(5, "Cinco");
		map.put(6, "Seis");
		map.put(7, "Siete");
		map.put(8, "Ocho");
		map.put(9, "Nueve");
		map.put(10, "Diez");
		map.put(11, "Once");
		map.put(12, "Doce");
		map.put(13, "Trece");
		map.put(14, "Catorce");
		map.put(15, "Quince");
		map.put(16, "Dieciséis");
		map.put(17, "Diecisiete");
		map.put(18, "Dieciocho");
		map.put(19, "Diecinueve");
		map.put(20, "Veinte");
		map.put(21, "Veintiuno");
		map.put(22, "Veintidós");
		map.put(23, "Veintitrés");
		map.put(24, "Veinticuatro");
		map.put(25, "Veinticinco");
		map.put(26, "Veintiséis");
		map.put(27, "Veintisiete");
		map.put(28, "Veintiocho");
		map.put(29, "Veintinueve");
		map.put(30, "Treinta");
		map.put(40, "Cuarenta");
		map.put(50, "Cincuenta");
		map.put(60, "Sesenta");
		map.put(70, "Setenta");
		map.put(80, "Ochenta");
		map.put(90, "Noventa");
		map.put(100, "Cien");
		map.put(200, "Doscientos");
		map.put(300, "Trescientos");
		return map;
	}

	private SpanishNumberName(final int value) {
		this.value = value;
	}

	public static SpanishNumberName of(int value) {
		return new SpanishNumberName(value);
	}

	public String name() {

		if (isCent(300)) {
			return centPlusElse(300);
		}

		if (isCent(200)) {
			return centPlusElse(200);
		}

		if (isCent(100)) {
			return centPlusElse(100);
		}

		return unitsOrTens(this.value);
	}

	private String centPlusElse(int cent) {
		return centName(cent) + " " + unitsOrTens(this.value - cent).toLowerCase();
	}

	private boolean isCent(int cent) {
		return this.value > cent && this.value < cent + 100;
	}

	private String centName(int cent) {
		if (cent == 100)
			return "Ciento";
		return NUMBER_NAMES.get(cent);
	}

	private String unitsOrTens(int currentValue) {
		String name = NUMBER_NAMES.get(currentValue);

		if (name == null) {
			int aTen = (currentValue / 10) * 10;
			return tenPlusUnits(aTen, currentValue);
		}
		return name;
	}

	private String tenPlusUnits(int aTen, int currentValue) {
		return NUMBER_NAMES.get(aTen) + " y " + NUMBER_NAMES.get(currentValue - aTen).toLowerCase();
	}
}
