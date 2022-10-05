package edu.buffalo.cse116;

/**
 * Instances of this class represents a single county in New York State and can be used to compute the cost of an item
 * within its border including both the state and local sales tax. <b>Note</b>: Sales taxes are recorded as a decimal
 * and not as a percentage; therefore an 8% sales tax should be stored as 0.08.
 *
 * @author Matthew Hertz
 */
public class NYCounty {
private String name;
private double taxRate;

  /**
   * Create a new instance of this class with the given name and local sales tax rate.
   *
   * @param countyName What the name of this county should be set.
   * @param countyRate The local sales tax to which we will add the 0.04 (4%) NY state sales tax.
   */
  public NYCounty(String countyName, double countyRate) {
    // TODO: Remember to add 0.04 to the county rate when storing the overall tax
    // rate!
	   name = countyName;
	   taxRate = countyRate+0.04;
	  
  }

  /**
   * Compute how much the current county would demand in taxes for purchasing a given item.
   *
   * @param price Cost of the item whose state sales tax need to be calculated.
   * @return Local sales tax that must be added to a purchase of a given item.
   */
  public double calculateSalesTax(double price) {
	 double SalesTax = price*taxRate;
	 return SalesTax;
  }

  /**
   * Returns the sales tax rate for purchases in this county (e.g., including both the county and state sales taxes).
   *
   * @return Tax rate for purchases in this county. This tax rate should be expressed in decimal (nor percentage) form.
   */
  public double getSalesTaxRate() {
	  return taxRate;
  
  }

  /**
   * Get the name of this county.
   *
   * @return What name the county goes by.
   */
  public String getName() {
	  return name;
  }

  /**
   * Update the local tax rate to close any budget gaps, overspending, and accepting that teaching faculty perform a
   * vital service and so should have their entire taxes refunded.
   *
   * @param newCountySalesTax New local sales tax rate for this county; the updated tax rate should add this new rate
   *          and the 0.04 state rate.
   */
  public void setSalesTaxRate(double newCountySalesTax) {
    // TODO: Remember to add 0.04 to the county rate when storing the overall tax
    // rate!
	  taxRate = newCountySalesTax+0.04;
  }

  /**
   * Rename the county to better represent your constituents.
   *
   * @param newName The new name for the county instance.
   */
  public void setName(String newName) {
	  name = newName;
  }
}
