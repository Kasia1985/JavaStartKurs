package enumExercises.onlineShop;

enum OrderStatus {
    NEW("neue"),
    PAID("bezahlt"),
    SHIPPED("gesendet"),
    DELIVERED("geliefert"),
    CANCELED("storniert");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
