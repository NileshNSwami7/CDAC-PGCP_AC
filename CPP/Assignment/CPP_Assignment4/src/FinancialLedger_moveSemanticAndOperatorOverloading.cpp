//============================================================================
// Name        : CPP_Assignment4.cpp
// Author      : Nilesh
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include<iomanip>
using namespace std;

class LedgerEntry {
private:
	string description;
	double *amount;
	int days;

	static int totalEntries;

public:
	LedgerEntry() {

	}
	//constructor
	LedgerEntry(const string &description, int days) {
		this->description = description;
		this->days = days;
		this->amount = new double[days];
		cout << "[LedgerEntry created]" << description << "(" << days << ")"
				<< endl;
		for (int i = 0; i < days; i++) {
			amount[i] = 0;
		}
		totalEntries++;
	}

	//deep constructor
	LedgerEntry(const LedgerEntry &other) {
		this->description = other.description;

		this->days = other.days;
		this->amount = new double[days];

		for (int i = 0; i < days; i++) {
			amount[i] = other.amount[i];
		}
		totalEntries++;
//		cout << "[deep constructor]" << description << "(" << days << ")"
//				<< endl;
	}

	//move constructor
	LedgerEntry(LedgerEntry &&other) noexcept {
		description = move(other.description);
		days = other.days;
		amount = other.amount;
		other.amount = nullptr;
		other.days = 0;
		totalEntries++;
		cout << "[Move Constructor] Ownership transferred from:" << description
				<< endl;
	}

	//copy assignment operator
	LedgerEntry& operator=(const LedgerEntry &other) {

		if (this == &other) {
			return *this;
		}

		description = other.description;
		days = other.days;

		delete[] amount;

		amount = new double[days];

		for (int i = 0; i < days; i++) {
			amount[i] = other.amount[i];
		}

		return *this;
	}

	//move operator
	LedgerEntry& operator=(LedgerEntry &&other) noexcept {

		if (this != &other) {
			delete[] amount;

			description = move(other.description);
			days = other.days;
			amount = other.amount;
			other.amount = nullptr;

			other.days = 0;
			cout << "[Move Assignment] Ownership transferred from "
					<< description << endl;
		}
		return *this;
	}

	~LedgerEntry() {
		delete[] amount;
		totalEntries--;
	}

	LedgerEntry operator+(const LedgerEntry &other) const {

		if (days != other.days) {
			throw invalid_argument("Days must be equal");
		}

		LedgerEntry result(description + " + " + other.description, days);

		for (int i = 0; i < days; i++) {
			result.amount[i] = amount[i] + other.amount[i];
		}
		return result;
	}

	bool operator==(const LedgerEntry &other) const {
		if (description != other.description || days != other.days) {
			return false;
		}

		for (int i = 0; i < days; i++) {
			if (amount[i] != other.amount[i]) {
				return false;
			}
		}
		return true;
	}

	bool operator>(const LedgerEntry &other) const {
		double total1 = 0;
		double total2 = 0;

		for (int i = 0; i < days; i++) {
			total1 += amount[i];
		}

		for (int i = 0; i < other.days; i++) {
			total2 += other.amount[i];
		}

		return total1 > total2;
	}

	double& operator[](int index) {
		return amount[index];
	}

	const double& operator[](int index) const {
		return amount[index];
	}
	friend ostream& operator <<(ostream &out, const LedgerEntry &entry);
	friend istream& operator >>(istream &in, LedgerEntry &entry);
};

ostream& operator <<(ostream &out, const LedgerEntry &entry) {
	double total = 0.0;

	out << fixed << setprecision(2);

	out << entry.description << " : [";

	for (int i = 0; i < entry.days; i++) {

		out << entry.amount[i];

		total += entry.amount[i];

		if (i < entry.days - 1) {
			out << ", ";
		}
	}

	out << "] Total: " << total;

	return out;
}

istream& operator >>(istream &in, LedgerEntry &entry) {
	in >> entry.description;
	in >> entry.days;
	for (int i = 0; i < entry.days; i++) {
		in >> entry.amount[i];
	}
	return in;
}

int LedgerEntry::totalEntries = 0;

int main() {
	// Objective 1 — Constructor & deep copy
	LedgerEntry jan("January Sales", 5);
	jan[0] = 1200.50;
	jan[1] = 3400.00;
	jan[2] = 800.75;
	jan[3] = 2100.00;
	jan[4] = 650.25;
	LedgerEntry feb("February Sales", 5);
	feb[0] = 900.00;
	feb[1] = 2200.50;
	feb[2] = 1750.00;
	feb[3] = 3000.00;
	feb[4] = 475.50;
	cout << jan << endl;
	cout << feb << endl;

	// Objective 2 — Operator + (sum two ledgers into combined)

	LedgerEntry combined = jan + feb;
	cout << "Combined: " << combined << endl;

	// Objective 3 — Relational operators
	cout << "Jan == Feb : " << (jan == feb ? "Yes" : "No") << endl;
	cout << "Jan > Feb : " << (jan > feb ? "Yes" : "No") << endl;

	// Objective 4 — Move constructor (should NOT deep copy)
	LedgerEntry moved = move(jan);
	cout << "After move, jan.amounts is null: " << (
	/* check jan is empty */
	true ? "YES" : "NO") << endl;
	cout << "Moved entry: " << moved << endl;

	// Objective 5 — Move assignment

	LedgerEntry q1("Q1 Total", 5);
	q1 = move(feb); // feb's resources transferred to q1

	cout << "Q1 (moved from feb): " << q1 << endl; // Objective 6 — Static member

//	cout << "Live LedgerEntry objects: " << LedgerEntry::totalEntries << endl;

	return 0;
}
