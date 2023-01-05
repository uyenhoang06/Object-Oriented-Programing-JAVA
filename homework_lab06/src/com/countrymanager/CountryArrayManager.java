package com.countrymanager;

public class CountryArrayManager {
    private Country[] countries;
    private int length;
    private int increment;

    public CountryArrayManager() {
        this.increment = 10;
        countries = new Country[this.increment];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        this.increment = 10;
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[this.countries.length + this.increment];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[minIdx].getPopulation() > newArray[j].getPopulation()) {
                    minIdx = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[minIdx];
            newArray[minIdx] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[maxIdx].getPopulation() < newArray[j].getPopulation()) {
                    maxIdx = j;
                }
            }
            Country temp = newArray[i];
            newArray[i] = newArray[maxIdx];
            newArray[maxIdx] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getArea() > newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of decreasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getArea() < newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int idx = 1; idx < newArray.length; idx++) {
            Country key = newArray[idx];
            int pos = idx - 1;
            while (pos >= 0 && newArray[pos].getGdp() > key.getGdp()) {
                newArray[pos + 1] = newArray[pos];
                pos--;
            }
            newArray[pos + 1] = key;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of decreasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int idx = 1; idx < newArray.length; idx++) {
            Country key = newArray[idx];
            int pos = idx - 1;
            while (pos >= 0 && newArray[pos].getGdp() < key.getGdp()) {
                newArray[pos + 1] = newArray[pos];
                pos--;
            }
            newArray[pos + 1] = key;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        AfricaCountry[] africaCountries = new AfricaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AfricaCountry) {
                africaCountries[index] = (AfricaCountry) country;
                index++;
            }
        }
        return africaCountries;
    }

    public AsiaCountry[] filterAsiaCountry() {
        AsiaCountry[] asiaCountries = new AsiaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof AsiaCountry) {
                asiaCountries[index] = (AsiaCountry) country;
                index++;
            }
        }
        return asiaCountries;
    }

    public EuropeCountry[] filterEuropeCountry() {
        EuropeCountry[] europeCountries = new EuropeCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof EuropeCountry) {
                europeCountries[index] = (EuropeCountry) country;
                index++;
            }
        }
        return europeCountries;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        NorthAmericaCountry[] northAmericaCountries = new NorthAmericaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof NorthAmericaCountry) {
                northAmericaCountries[index] = (NorthAmericaCountry) country;
                index++;
            }
        }
        return northAmericaCountries;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        OceaniaCountry[] oceaniaCountries = new OceaniaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof OceaniaCountry) {
                oceaniaCountries[index] = (OceaniaCountry) country;
                index++;
            }
        }
        return oceaniaCountries;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        SouthAmericaCountry[] southAmericaCountries = new SouthAmericaCountry[countries.length];
        int index = 0;
        for (Country country : countries) {
            if (country instanceof SouthAmericaCountry) {
                southAmericaCountries[index] = (SouthAmericaCountry) country;
                index++;
            }
        }
        return southAmericaCountries;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] newCountries = sortByDecreasingPopulation();
        Country[] mostPopulationCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            mostPopulationCountries[i] = newCountries[i];
        }
        return mostPopulationCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] newCountries = sortByIncreasingPopulation();
        Country[] leastPopulationCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            leastPopulationCountries[i] = newCountries[i];
        }
        return leastPopulationCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] newCountries = sortByDecreasingArea();
        Country[] largestAreaCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            largestAreaCountries[i] = newCountries[i];
        }
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] newCountries = sortByIncreasingArea();
        Country[] smallestAreaCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            smallestAreaCountries[i] = newCountries[i];
        }
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] newCountries = sortByDecreasingGdp();
        Country[] highestGdpCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            highestGdpCountries[i] = newCountries[i];
        }
        return highestGdpCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] newCountries = sortByIncreasingGdp();
        Country[] lowestGdpCountries = new Country[howMany];
        for (int i = 0; i < howMany; i++) {
            lowestGdpCountries[i] = newCountries[i];
        }
        return lowestGdpCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}

