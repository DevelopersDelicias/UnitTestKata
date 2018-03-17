package com.developersdelicias.katas.junit;

import java.util.HashMap;
import java.util.Map;

public class SpanishNumberName {
	private final int value;

	private static final Map<Integer, String> NUMBER_NAMES = createNumberNamesMap();

	private static Map<Integer, String> createNumberNamesMap() {
		Map<Integer, String> map = new HashMap<>();
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
		return map;
	}

	private SpanishNumberName(final int value) {
		this.value = value;
	}

	public static SpanishNumberName of(int value) {
		return new SpanishNumberName(value);
	}

	public String name() {
		if (this.value > 30) {
			return NUMBER_NAMES.get(30) + " y " + NUMBER_NAMES.get(this.value - 30).toLowerCase();
		}
		return NUMBER_NAMES.get(this.value);
	}
}