package com.countrymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        /* TODO: write code to test program */

        System.out.println("test original data: ");
        testOriginalData();
        System.out.println();

        //test sort
        System.out.println("increasing by population:");
        testSortIncreasingByPopulation();
        System.out.println();

        System.out.println("decreasing by population:");
        testSortDecreasingByPopulation();
        System.out.println();

        System.out.println("increasing by area:");
        testSortIncreasingByArea();
        System.out.println();

        System.out.println("decreasing by area:");
        testSortDecreasingByArea();
        System.out.println();

        System.out.println("increasing by gdp:");
        testSortIncreasingByGdp();
        System.out.println();

        System.out.println("decreasing by gdp:");
        testSortDecreasingByGdp();
        System.out.println();

        //test filter
        System.out.println("filter Africa Country:");
        testFilterAfricaCountry();
        System.out.println();

        System.out.println("filter Asia Country:");
        testFilterAsiaCountry();
        System.out.println();

        System.out.println("filter Europe Country:");
        testFilterEuropeCountry();
        System.out.println();

        System.out.println("filter North America Country:");
        testFilterNorthAmericaCountry();
        System.out.println();

        System.out.println("filter South America Country:");
        testFilterSouthAmericaCountry();
        System.out.println();

        System.out.println("filter Oceania Country:");
        testFilterOceaniaCountry();
        System.out.println();

        System.out.println("filter most populous countries:");
        testFilterMostPopulousCountries();
        System.out.println();

        System.out.println("filter least populous countries:");
        testFilterLeastPopulousCountries();
        System.out.println();

        System.out.println("filter largest area countries:");
        testFilterLargestAreaCountries();
        System.out.println();

        System.out.println("filter smallest area countries:");
        testFilterSmallestAreaCountries();
        System.out.println();

        System.out.println("filter highest gdp countries:");
        testFilterHighestGdpCountries();
        System.out.println();

        System.out.println("filter lowest gdp countries:");
        testFilterLowestGdpCountries();
    }

    public static void init() {
        String filePath = "src/data/countries.csv";
        readListData(filePath);
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            dataReader = new BufferedReader(new FileReader(filePath));
            // Read file in java line by line.

            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                 * TODO: create Country and append countries into
                 * CountryArrayManager here.
                 */
                String code = dataList.get(0);
                String name = dataList.get(1);
                int population = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));
                String continent = dataList.get(5).trim();
                Country newCountry = null;
                if (continent.equals("Africa")) {
                    newCountry = new AfricaCountry(code, name, population, area, gdp);
                } else if (continent.equals("Asia")) {
                    newCountry = new AsiaCountry(code, name, population, area, gdp);
                } else if (continent.equals("Europe")) {
                    newCountry = new EuropeCountry(code, name, population, area, gdp);
                } else if (continent.equals("South America")) {
                    newCountry = new SouthAmericaCountry(code, name, population, area, gdp);
                } else if (continent.equals("North America")) {
                    newCountry = new NorthAmericaCountry(code, name, population, area, gdp);
                } else if (continent.equals("Oceania")) {
                    newCountry = new OceaniaCountry(code, name, population, area, gdp);
                }
                countryManager.append(newCountry);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = countryManager.sortByDecreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = countryManager.sortByIncreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = countryManager.sortByDecreasingArea();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = countryManager.sortByIncreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = countryManager.sortByDecreasingGdp();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = countryManager.filterAfricaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = countryManager.filterAsiaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = countryManager.filterEuropeCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = countryManager.filterNorthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = countryManager.filterOceaniaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = countryManager.filterSouthAmericaCountry();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = countryManager.filterMostPopulousCountries(4);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = countryManager.filterLeastPopulousCountries(4);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = countryManager.filterLargestAreaCountries(4);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = countryManager.filterSmallestAreaCountries(4);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = countryManager.filterHighestGdpCountries(4);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = countryManager.filterLowestGdpCountries(4);
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }
}

