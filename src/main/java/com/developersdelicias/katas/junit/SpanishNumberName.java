package com.developersdelicias.katas.junit;

import java.util.HashMap;
import java.util.Map;

public class SpanishNumberName {
	private static final int ONE_THOUSAND = 1000;
	private static final Map<Long, String> NUMBER_NAMES = createNumberNamesMap();
	private static final int ONE_MILLION = 1_000_000;
	private final long value;
	private static final String THOUSAND_NAME = "Mil";

	private SpanishNumberName(final long value) {
		this.value = value;
	}

	private static Map<Long, String> createNumberNamesMap() {
		Map<Long, String> map = new HashMap<>();
		map.put(0L, "Cero");
		map.put(1L, "Uno");
		map.put(2L, "Dos");
		map.put(3L, "Tres");
		map.put(4L, "Cuatro");
		map.put(5L, "Cinco");
		map.put(6L, "Seis");
		map.put(7L, "Siete");
		map.put(8L, "Ocho");
		map.put(9L, "Nueve");
		map.put(10L, "Diez");
		map.put(11L, "Once");
		map.put(12L, "Doce");
		map.put(13L, "Trece");
		map.put(14L, "Catorce");
		map.put(15L, "Quince");
		map.put(16L, "Dieciséis");
		map.put(17L, "Diecisiete");
		map.put(18L, "Dieciocho");
		map.put(19L, "Diecinueve");
		map.put(20L, "Veinte");
		map.put(21L, "Veintiuno");
		map.put(22L, "Veintidós");
		map.put(23L, "Veintitrés");
		map.put(24L, "Veinticuatro");
		map.put(25L, "Veinticinco");
		map.put(26L, "Veintiséis");
		map.put(27L, "Veintisiete");
		map.put(28L, "Veintiocho");
		map.put(29L, "Veintinueve");
		map.put(30L, "Treinta");
		map.put(40L, "Cuarenta");
		map.put(50L, "Cincuenta");
		map.put(60L, "Sesenta");
		map.put(70L, "Setenta");
		map.put(80L, "Ochenta");
		map.put(90L, "Noventa");
		map.put(100L, "Cien");
		map.put(200L, "Doscientos");
		map.put(300L, "Trescientos");
		map.put(400L, "Cuatrocientos");
		map.put(500L, "Quinientos");
		map.put(600L, "Seiscientos");
		map.put(700L, "Setecientos");
		map.put(800L, "Ochocientos");
		map.put(900L, "Novecientos");
		return map;
	}

	public static SpanishNumberName of(long value) {
		return new SpanishNumberName(value);
	}

	public String name() {
		if (hasExistingName())
			return currentName();

		long currentValue = this.value;

		if (currentValue >= ONE_MILLION) {
			final String millions = millionsOf(currentValue);

			final long thousands = currentValue % ONE_MILLION;
			return isOneMillion(currentValue) ? millions :
					millions + " " + fromThousands(thousands).toLowerCase();
		}

		return fromThousands(currentValue);
	}

	private boolean isOneMillion(long currentValue) {
		return isDivisibleBy(currentValue, ONE_MILLION);
	}

	private String millionsOf(long currentValue) {
		long millions = currentValue / ONE_MILLION;
		return millions == 1 ? "Un millón" : fromThousands(millions) + " millones";
	}

	private String fromThousands(long currentValue) {
		long thousands = withoutRemaining(currentValue, ONE_THOUSAND);
		if (thousands >= ONE_THOUSAND) {
			String thousandName = thousandNameFor(thousands);
			if (isOneThousand(currentValue))
				return thousandName;
			final long hundreds = currentValue % ONE_THOUSAND;
			return thousandName + " " + hundredsTensAndUnits(hundreds).toLowerCase();
		}

		return hundredsTensAndUnits(currentValue);
	}

	private boolean isOneThousand(long currentValue) {
		return isDivisibleBy(currentValue, ONE_THOUSAND);
	}

	private String thousandNameFor(long thousands) {
		return thousands == ONE_THOUSAND
				? THOUSAND_NAME
				: hundredsTensAndUnits(thousands / ONE_THOUSAND) + " " + THOUSAND_NAME.toLowerCase();
	}

	private boolean isDivisibleBy(long currentValue, int divisor) {
		return currentValue % divisor == 0;
	}

	private String hundredsTensAndUnits(long currentValue) {
		if (nameOf(currentValue) != null)
			return nameOf(currentValue);

		long hundreds = withoutRemaining(currentValue, 100);
		if (isHundred(hundreds)) {
			return hundredsTensAndUnits(hundreds, currentValue);
		}
		return unitsOrTens(currentValue);
	}

	private long withoutRemaining(long currentValue, int multiplier) {
		return (currentValue / multiplier) * multiplier;
	}

	private String currentName() {
		return nameOf(this.value);
	}

	private boolean hasExistingName() {
		return currentName() != null;
	}

	private String hundredsTensAndUnits(long hundreds, long currentValue) {
		final long tens = currentValue % hundreds;
		return hundredsOf(hundreds) + " " + unitsOrTens(tens).toLowerCase();
	}

	private boolean isHundred(long cent) {
		return cent >= 100;
	}

	private String hundredsOf(long hundreds) {
		return hundreds == 100 ? "Ciento" : nameOf(hundreds);
	}

	private String unitsOrTens(long currentValue) {
		String name = nameOf(currentValue);

		if (name != null)
			return name;

		long tens = withoutRemaining(currentValue, 10);
		return tensAndUnits(tens, currentValue);
	}

	private String tensAndUnits(long tens, long currentValue) {
		final long units = currentValue % tens;
		return nameOf(tens) + " y " + nameOf(units).toLowerCase();
	}

	private String nameOf(long number) {
		return NUMBER_NAMES.get(number);
	}
}
