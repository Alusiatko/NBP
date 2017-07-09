package pl.parser.nbp;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class CalculationHelper {
    public double countAverage(List<String> prices) {

        List<Double> doubleList = Lists.newArrayList();
        doubleList.addAll(prices.stream().map(Double::parseDouble).collect(Collectors.toList()));

        /*for (String price : prices) {
            double doublePrice = Double.parseDouble(price);
            doubleList.add(doublePrice);
        }*/

        //return doubleList.stream().mapToDouble(a -> a).average().orElse(0);
        double avg = doubleList.stream().mapToDouble(a -> a).average().orElse(0);
        return avg;
    }
}