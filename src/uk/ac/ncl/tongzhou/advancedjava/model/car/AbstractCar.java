
/**
 * @Description: 
 * @author: Tong Zhou b8027512@ncl.ac.uk
 * @created: 01:24 23-10-2018
 */
package uk.ac.ncl.tongzhou.advancedjava.model.car;

import uk.ac.ncl.tongzhou.advancedjava.model.CarRegistrationNumber;
import uk.ac.ncl.tongzhou.advancedjava.model.Person;

/**
 * @ClassName: AbstractCar
 * @Description: The abstract class of all cars, including small cars and large
 *               cars
 * 
 */
@Deprecated
public abstract class AbstractCar implements Car {
	private CarRegistrationNumber crn;
	protected int currentFuelAmount;
	protected int fuelTankCapacity;
	private Person renter;

	/**
	 * @Title: Constructor for AbstractCar
	 * @Description:
	 * @param crn
	 */
	protected AbstractCar(CarRegistrationNumber crn) {
		this.crn = crn;
	}

	/**
	 * @Title: getCarRegistrationNumber
	 * @Description:
	 * @return
	 * @see uk.ac.ncl.tongzhou.advancedjava.model.car.Car#getCarRegistrationNumber()
	 */
	@Override
	public CarRegistrationNumber getCarRegistrationNumber() {
		return crn;
	}

	/**
	 * @Title: getFuelTankCapacity
	 * @Description:
	 * @return
	 * @see uk.ac.ncl.tongzhou.advancedjava.model.car.Car#getFuelTankCapacity()
	 */
	@Override
	public int getFuelTankCapacity() {
		return fuelTankCapacity;
	}

	/**
	 * @Title: getCurrentFuelAmount
	 * @Description:
	 * @return
	 * @see uk.ac.ncl.tongzhou.advancedjava.model.car.Car#getCurrentFuelAmount()
	 */
	@Override
	public int getCurrentFuelAmount() {
		return currentFuelAmount;
	}

	/**
	 * @Title: isFullFuelInTank
	 * @Description:
	 * @return
	 * @see uk.ac.ncl.tongzhou.advancedjava.model.car.Car#isFullFuelInTank()
	 */
	@Override
	public boolean isFullFuelInTank() {
		return fuelTankCapacity == currentFuelAmount;
	}

	/**
	 * @Title: addFuelToTank
	 * @Description:
	 * @param fuelToAdd
	 * @return
	 * @see uk.ac.ncl.tongzhou.advancedjava.model.car.Car#addFuelToTank(int)
	 */
	@Override
	public int addFuelToTank(int fuelToAdd) {
		int fuelNeeded = fuelTankCapacity - currentFuelAmount;
		if (fuelToAdd > fuelNeeded) {
			currentFuelAmount = fuelTankCapacity;
			return fuelNeeded;
		} else {
			currentFuelAmount += fuelToAdd;
			return fuelToAdd;
		}
	}

	/**
	 * Return the renter of this car. If the car is not rented, return null.
	 *
	 * @return renter
	 */
	public Person getRenter() {
		return renter;
	}

	/**
	 * Set the value of renter
	 *
	 * @param renter:
	 *            renter to be set.
	 */
	public void setRenter(Person renter) {
		this.renter = renter;
	}

	/**
	 * @Title: toString
	 * @Description:
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car-" + crn + " [Fuel=" + currentFuelAmount + "/" + fuelTankCapacity + ", renter=" + renter + "]";
	}

}