package stream.reduce.examples.a2;

import java.util.Arrays;
import java.util.List;

//100.00, 105.00, 110.50, 115.50, 120.50
//sum of all products whose price is more than 105.00 after discount 0f 10%
//(110.50 / 1.10) +  (115.50 / 1.10) +  (120.50 / 1.10)
//total Rs.315.00


public class ReduceWithIntegerExample {

	public static void main(String[] args) {
		List<Double> priceList = Arrays.asList(100.00, 105.00, 110.50, 115.50, 120.50);

		Double total = priceList.stream()

				.filter(price -> price > 105.00)

				.mapToDouble(price -> price / 1.10)

				.sum();

		System.out.println(total);
		System.out.println((110.50 / 1.10) +  (115.50 / 1.10) +  (120.50 / 1.10));

	}

}
