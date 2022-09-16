package specifications;

public record IntegerInputSpecification(String inputMessage, String invalidValueMessage, int maxValue, int minValue) {

    @Override
    public String inputMessage() {
        return inputMessage;
    }

    @Override
    public String invalidValueMessage() {
        return invalidValueMessage;
    }

    @Override
    public int maxValue() {
        return maxValue;
    }

    @Override
    public int minValue() {
        return minValue;
    }
}
