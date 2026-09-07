/*
 * Person.h
 *
 *  Created on: 06-Sep-2026
 *      Author: Nilesh
 */

#ifndef PERSON_H_
#define PERSON_H_

#include<iostream>
#include<string>
using namespace std;

namespace LibrarySystem {
class Person {
protected:
	int id;
	string name;
	string phone;
public:
	Person();
	Person(int id, const string &name, const string &phone);
	virtual void displayInfo()=0;

	virtual ~Person();
};
}

#endif /* PERSON_H_ */
