import java.math.*;
/**
 * Created by katherine_celeste on 8/4/16.
 */
public class PhonePartsCatalogPricing {
    private BigDecimal digitizerAssembly;
    private BigDecimal lcd;
    private BigDecimal homeButtonAssembly;
    private BigDecimal sensorFlexCable;
    private BigDecimal earPieceSpeaker;

    //Determine which phone was selected

    PhonePartsCatalogPricing(int phoneSelection)
    {
        switch (phoneSelection) {
            case 1 : // if user selected iPhone, initialize to the following prices:
                digitizerAssembly= new BigDecimal("5.91");
                lcd = new BigDecimal("100.77");
                homeButtonAssembly = new BigDecimal("10.99");
                sensorFlexCable = new BigDecimal("7.25");
                earPieceSpeaker = new BigDecimal("24.95");
                break;
            case 2: // else if user selected HTC, initialize to the following prices:
                digitizerAssembly= new BigDecimal("3.65");
                lcd = new BigDecimal("85.77");
                homeButtonAssembly = new BigDecimal("6.99");
                sensorFlexCable = new BigDecimal("3.25");
                earPieceSpeaker = new BigDecimal("14.95");
                break;
            default:
                System.out.println("Invalid input: please select a numeric option (1 or 2)");

        }
    }

   public BigDecimal calculateTotal ()
    {
        BigDecimal fAmountOne = this.digitizerAssembly.add(lcd).add(homeButtonAssembly)
                .add(sensorFlexCable).add(earPieceSpeaker);

        return fAmountOne;
    }

    public static BigDecimal priceDifference(BigDecimal a, BigDecimal b)
    {
        BigDecimal difference = b.subtract(a);
        return difference;
    }

    // Print out list of parts for the phone selected
    @Override
    public String toString()
    {
        String s = "Digitizer Assembly: $" + this.digitizerAssembly +
                    "\nLCD: $" + this.lcd +
                    "\nHome Button Assembly: $" + this.homeButtonAssembly +
                    "\nSensor Flex Cable: $" + this.sensorFlexCable +
                    "\nEar Piece Speaker: $" + this.earPieceSpeaker +
                "\n\nTotal (excluding tax): $" + calculateTotal();
        return s;
    }

}
