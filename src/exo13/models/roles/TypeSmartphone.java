package exo13.models.roles;

public enum TypeSmartphone {
    APPLE_IPHONE_L("Apple Iphone L"),
    APPLE_IPHONE_XS("Apple Iphone XS"),
    GOOGLE_PIXEL("Google Pixel"),
    SAMSUNG_GALAXY_5("Samsung Galaxy 5"),
    SAMSUNG_NOTE_3("Samsung Note 3");

    String typeSmartphone;

    TypeSmartphone(String typeSmartphone) {
        this.typeSmartphone = typeSmartphone;
    }
}
