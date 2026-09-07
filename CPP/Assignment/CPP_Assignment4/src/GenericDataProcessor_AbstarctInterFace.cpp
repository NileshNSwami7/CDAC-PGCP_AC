/*
 * GenericDataProcessor_AbstarctInterFace.cpp
 *
 *  Created on: 05-Sep-2026
 *      Author: Nilesh
 */

#include<iostream>
#include<vector>
#include<string>
#include<algorithm>

using namespace std;

class DataProcessor {
public:
	virtual void loadData(const string &source)=0;
	virtual void processData()=0;
	virtual void exportResult(const string &desstination)=0;
	virtual string processorType() const =0;
	virtual int recordCount() const =0;
	;

	virtual void printSummary() const {
		cout << "Processor Type: " << processorType() << endl;
		cout << "Record Count: " << recordCount() << endl;
	}

	virtual ~DataProcessor() {
	}
};

class CSVProcessor: public DataProcessor {

	vector<string> records;

public:

	void loadData(const string &source) override {
		cout << "[Loading data.." << source << "]" << endl;

		records.push_back("Nilesh, IN01075, SE");
		records.push_back("Mahesh, IN01095, SE");
		records.push_back("Ritesh, IN01079, QA");
		records.push_back("Nikhil, IN01045, QS");
		records.push_back("Babita, IN01080, HR");
		records.push_back("Heena, IN01042, BA");

	}

	void processData() override {
		for (string &str : records) {
			for (char &c : str) {
				c = toupper(c);
			}
		}
		cout << "[CSV DataProcessor]" << endl;
	}

	void exportResult(const string &desstination) override {
		cout << "[CSV Export :" << desstination << "]" << endl;

		for (string &str : records) {
			cout << str << endl;
		}
	}
	string processorType() const override {
		return "CSV Processor";
	}
	int recordCount() const override {
		return records.size();
	}
};

class SensorStreamProcessor: public DataProcessor {
private:
	vector<double> sensor;

	double mean = 0.0;
	double min = 0.0;
	double max = 0.0;
public:

	void loadData(const string &source) override {
		cout << "[Loading data.. << ]" << endl;

		sensor.push_back(23.4);
		sensor.push_back(21.8);
		sensor.push_back(25.1);
		sensor.push_back(25.4);
		sensor.push_back(54.8);
		sensor.push_back(12.1);
		sensor.push_back(22.4);
		sensor.push_back(45.8);

	}

	void processData() override {
		double sum = 0.0;

		for (double num : sensor) {
			sum += num;
		}
		cout << "Mean : " << sum / sensor.size()<<" ";
		cout << "Min  : " << *min_element(sensor.begin(), sensor.end())<<" ";
		cout << "Max  : " << *max_element(sensor.begin(), sensor.end())<<endl;
	}
	void exportResult(const string &desstination) {
		cout << "[Destination]" << endl;
		for (double sen : sensor) {
			cout << sen << endl;
		}
	}
	string processorType() const override {
		return "Sensor Stream Process.";
	}
	int recordCount() const override {
		return sensor.size();
	}
	;

};

int main() {

	CSVProcessor cp;

	cp.loadData("employee.csv");
	cp.processData();
	cp.exportResult("output.csv");
	cout << "Summery" << endl;
	cp.printSummary();

	cout << "--------------------------------" << endl;

	SensorStreamProcessor sp;
	sp.loadData("employee.csv");
	sp.processData();
	sp.exportResult("output.csv");
	cout << "Summery" << endl;
	sp.printSummary();
	return 0;
}
