/** @author Derek Qu  */

import static com.proto_i18n.generated.Country.name;
import static com.proto_i18n.generated.Country.unCode;
import static com.proto_i18n.generated.Country.alpha3;
import static com.proto_i18n.generated.Country.currencyCode;
import com.proto_i18n.generated.Country;
import com.proto_i18n.generated.Currency;

public class main {
  public static void main(String[] args) {
    System.out.println(Country.CountryCode.CN.getValueDescriptor().getOptions().getExtension(name));
  }
}
