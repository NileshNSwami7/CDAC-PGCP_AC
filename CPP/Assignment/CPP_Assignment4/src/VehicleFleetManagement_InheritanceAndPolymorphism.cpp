/*
 * VehicleFleetManagement_InheritanceAndPolymorphism.cpp
 *
 *  Created on: 05-Sep-2026
 *      Author: Nilesh
 */

#include<iostream>
#include<Vector>
#include<iomanip>
#include<cstring>

using namespace std;

class Vehicle {
protected:
	string registrationNo;
	string ownerName;
	int yearOfManufacturer;
	double kmDriven;

public:
	Vehicle(const string &reg, const string &owner, int year, double km) {
		this->registrationNo = reg;
		this->ownerName = owner;
		this->yearOfManufacturer = year;
		this->kmDriven = km;

		cout << "[Vehicle constructor]" << endl;
	}

	virtual double fuelCost(double kmToTravel) const =0;

	virtual void describe() const {
		cout << left << setw(15) << registrationNo << "  ";
		cout << setw(20) << ownerName;
		cout << setw(25) << yearOfManufacturer;
		cout << setw(15) << kmDriven;
		cout << endl;
	}

	virtual string vehicleType() const =0;

	virtual ~Vehicle() {
		cout << "[Vehicle Destructor]" << endl;
	}

	double getKmDriven() const {
		return kmDriven;
	}

	string getRegNo() {
		return registrationNo;
	}
};

class Car: public Vehicle {

	string fuelType;
	double mileageKmpl;
public:
	Car(const string &fuelType, double mileageKmpl,
			const string &registrationNo, const string &ownerName,
			int yearOfManufacturer, double kmDriven) :
			Vehicle(registrationNo, ownerName, yearOfManufacturer, kmDriven) {
		this->fuelType = fuelType;
		this->mileageKmpl = mileageKmpl;

		cout << "[Car Constructor]" << endl;
	}
	string getFuelType() const {
		return fuelType;
	}
	string vehicleType() const override {
		return "Car";
	}

	double fuelCost(double kmToTravel) const override {

		double fuelPricePerLitre;
		if (fuelType == "Petrol") {
			fuelPricePerLitre = 106.00;
		} else if (fuelType == "Disel") {
			fuelPricePerLitre = 96.00;
		} else {
			fuelPricePerLitre = 0.0;
		}

		return (kmToTravel / mileageKmpl * fuelPricePerLitre);
	}

	virtual ~Car() {
		cout << "[Car Destructor]" << endl;
	}

	virtual void describe() const override {
		cout << left << setw(15) << registrationNo << "  ";
		cout << setw(20) << ownerName;
		cout << setw(25) << yearOfManufacturer;
		cout << setw(15) << kmDriven;
		cout << endl;
	}

};

class Truck: public Vehicle {

	double payloadCapacityTons;
	double fuelEfficiencyKmpl;

public:

	Truck(double payloadCapacityTons, double fuelEfficiencyKmpl,
			const string &registrationNo, const string &ownerName,
			int yearOfManufacturer, double kmDriven) :
			Vehicle(registrationNo, ownerName, yearOfManufacturer, kmDriven) {
		this->payloadCapacityTons = payloadCapacityTons;
		this->fuelEfficiencyKmpl = fuelEfficiencyKmpl;
		cout << "[Truck Constructor]" << endl;
		cout << endl;

	}

	string vehicleType() const override {
		return "Truck";
	}

	double fuelCost(double kmToTravel) const override {
		double fuelEfficiency = fuelEfficiencyKmpl
				* (1 - 0.05 * payloadCapacityTons);
		double fuelPricePerLitre = 96.00;

		return (kmToTravel / fuelEfficiency * fuelPricePerLitre);
	}

	virtual ~Truck() {
		cout << "[Truck Destructor]" << endl;
	}

	virtual void describe() const override {
		cout << left << setw(15) << registrationNo << "  ";
		cout << setw(20) << ownerName;
		cout << setw(25) << yearOfManufacturer;
		cout << setw(15) << kmDriven;
		cout << endl;
	}

};

class ElectricTruck: public Truck {

	double batteryCapacityKWh;
	double rangePerChargeKm;

public:
	ElectricTruck(double batteryCapacityKWh, double rangePerChargeKm,
			double payloadCapacityTons, double fuelEfficiencyKmpl,
			const string &registrationNo, const string &ownerName,
			int yearOfManufacturer, double kmDriven) :
			Truck(payloadCapacityTons, fuelEfficiencyKmpl, registrationNo,
					ownerName, yearOfManufacturer, kmDriven) {
		this->batteryCapacityKWh = batteryCapacityKWh;
		this->rangePerChargeKm = rangePerChargeKm;
		cout << "[ElectricTruck Constructor]" << endl;

	}
	double getRangePercharge() const {
		return rangePerChargeKm;
	}
	double fuelCost(double kmToTravel) const override {
		double electricityCostPerUnit = 9.50;
		return ((kmToTravel / rangePerChargeKm) * batteryCapacityKWh
				* electricityCostPerUnit);
	}

	string vehicleType() const {
		return "Electric Truck";
	}

	virtual void describe() const override {
		cout << left << setw(15) << registrationNo << "  ";
		cout << setw(20) << ownerName;
		cout << setw(25) << yearOfManufacturer;
		cout << setw(15) << kmDriven;
		cout << endl;
	}

	virtual ~ElectricTruck() {
		cout << "[ElectricTruck Destructor]" << endl;
	}
};

class Van: public Vehicle {
	int seatingCapacity;
	double mileageKmpl;

public:
	Van(int seatingCapacity, double mileageKmpl, const string &registrationNo,
			const string &ownerName, int yearOfManufacturer, double kmDriven) :
			Vehicle(registrationNo, ownerName, yearOfManufacturer, kmDriven) {
		this->seatingCapacity = seatingCapacity;
		this->mileageKmpl = mileageKmpl;
		cout << "[Van Constructor]" << endl;
	}

	double fuelCost(double kmToTravel) const override {
		return (kmToTravel / mileageKmpl * 106.00);
	}

	string vehicleType() const {
		return "Van";
	}

	virtual ~Van() {
		cout << "[Van destructor]" << endl;
	}

	virtual void describe() const {
		cout << left << setw(15) << registrationNo << "  ";
		cout << setw(20) << ownerName;
		cout << setw(25) << yearOfManufacturer;
		cout << setw(15) << kmDriven;
		cout << endl;
	}
};
void printFleetReport(const vector<Vehicle*> &fleet, double tripKm) {

	cout << "===== FLEET REPORT — Trip Distance: 200 km =====" << endl;

	Vehicle *mostEfficiet = nullptr;
	double lowCost = 0.0;

	for (const auto &veh : fleet) {

		double cost = veh->fuelCost(tripKm);
		cout << fixed << setprecision(2);

		cout << veh->getRegNo() << "(" << veh->vehicleType() << ")"
				<< "  :   Rs. " << veh->fuelCost(tripKm);

		Car *car = dynamic_cast<Car*>(veh);
		if (car != nullptr) {
			cout << "(" << car->getFuelType() << ")";
		}

		ElectricTruck *elctricTruck = dynamic_cast<ElectricTruck*>(veh);
		if (elctricTruck != nullptr) {
			cout << "[ Battery : " << elctricTruck->getRangePercharge()
					<< "% charged]";
		}

		cout << endl;

		if (mostEfficiet == nullptr || cost < lowCost) {
			mostEfficiet = veh;
			lowCost = cost;
		}
	}

	if (mostEfficiet != nullptr) {
		cout << "Most Efficient Vehicle:" << mostEfficiet->getRegNo() << "("
				<< mostEfficiet->vehicleType() << ") - Rs." << lowCost
				<< " for " << tripKm << "km";
	}

}
int main() {

	Vehicle *vehicle;

	vector<Vehicle*> v;
	v.push_back(
			new Car("Petrol", 23.00, "KA01AA001", "Ramesh Kumar", 2020,
					45200.00));

	v.push_back(
			new Truck(4.00, 12.5, "MH04BB002", "Shyam Logistics", 2022,
					123500.00));

	v.push_back(
			new ElectricTruck(81.578947, 400.00, 1200.00, 14.50, "GJ07CC003",
					"Green Fleet Co", 2025, 89000.00));

	v.push_back(new Van(18, 15.00, "MH02FD5564", "Sankaran", 2015, 200.00));
	cout << "===== FLEET REPORT — Trip Distance: 200 km =====" << endl;
	cout << left << setw(15) << "Reg" << setw(20) << "Type" << setw(25)
			<< "Owner" << setw(15) << "Km Driven" << endl;

	for (const auto &veh : v) {
		veh->describe();
	}
	printFleetReport(v, 200);
	for (Vehicle* veh : v) {
	    delete veh;
	}
	return 0;
}
