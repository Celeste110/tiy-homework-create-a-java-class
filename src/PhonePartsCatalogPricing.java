import java.math.*;
/**
 * Created by katherine_celeste on 8/4/16.
 */
public class PhonePartsCatalogPricing {
    private BigDecimal digitizerAssemblyPrice;
    private BigDecimal lcdPrice;
    private BigDecimal homeButtonAssemblyPrice;
    private BigDecimal sensorFlexCablePrice;
    private BigDecimal earPieceSpeakerPrice;

    //Determine which phone was selected

    PhonePartsCatalogPricing(int phoneSelection)
    {
        switch (phoneSelection) {
            case 1 : // if user selected iPhone, initialize to the following prices:
                digitizerAssemblyPrice= new BigDecimal("5.91");
                lcdPrice = new BigDecimal("100.77");
                homeButtonAssemblyPrice = new BigDecimal("10.99");
                sensorFlexCablePrice = new BigDecimal("7.25");
                earPieceSpeakerPrice = new BigDecimal("24.95");
                break;
            case 2: // else if user selected HTC, initialize to the following prices:
                digitizerAssemblyPrice= new BigDecimal("3.65");
                lcdPrice = new BigDecimal("85.77");
                homeButtonAssemblyPrice = new BigDecimal("6.99");
                sensorFlexCablePrice = new BigDecimal("3.25");
                earPieceSpeakerPrice = new BigDecimal("14.95");
                break;
            default:
                System.out.println("Invalid input: please select a numeric option (1 or 2)");

        }
    }

   public BigDecimal calculateTotal ()
    {
        BigDecimal fAmountOne = this.digitizerAssemblyPrice.add(lcdPrice).add(homeButtonAssemblyPrice)
                .add(sensorFlexCablePrice).add(earPieceSpeakerPrice);

        return fAmountOne;
    }

    public static BigDecimal priceDifference(BigDecimal a, BigDecimal b)
    {
        BigDecimal difference = b.subtract(a);
        return difference;
    }

    public BigDecimal setdigitizerAssemblyPrice()
    {
        return this.digitizerAssemblyPrice.subtract(new BigDecimal("2.00"));
    }

    public BigDecimal setlcdPrice()
    {
        return this.lcdPrice.subtract(new BigDecimal("2.00"));
    }

    // Print out list of parts for the phone selected
    @Override
    public String toString()
    {
        String s = "Digitizer Assembly: $" + this.digitizerAssemblyPrice +
                    "\nLCD: $" + this.lcdPrice +
                    "\nHome Button Assembly: $" + this.homeButtonAssemblyPrice +
                    "\nSensor Flex Cable: $" + this.sensorFlexCablePrice +
                    "\nEar Piece Speaker: $" + this.earPieceSpeakerPrice +
                "\n\nTotal (excluding tax): $" + calculateTotal();
        return s;
    }

}
